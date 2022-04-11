package arquivo;

import sistema_escolar.Pessoa;
import java.util.Scanner;
import java.util.Random;
import sistema_escolar.Alune;
import sistema_escolar.BancoDados;
import sistema_escolar.Curso;

public class BancoDadosArray implements BancoDados {

    private Pessoa[] pessoa;

    public BancoDadosArray(int tamanho) {
        pessoa = new Pessoa[tamanho];
    }

   @Override
    public void inserirPessoa(Pessoa pessoa) {

        for (int i = 0; i < this.pessoa.length; i++) {
            if (this.pessoa[i] == null) {
                this.pessoa[i] = pessoa;
                return;
            }
        }
    }

   @Override
    public Pessoa procurarPessoa(String cpf) {

       for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getCpf().equals(cpf)) {
                return  pessoa[i];            }

        }

        return null;
	  
    }

    @Override
    public void removerPessoa(String cpf) {
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] != null && procurarPessoa(cpf) != null && procurarPessoa(cpf).equals(pessoa[i])) {
                pessoa[i] = null;

            }
        }
    }

    public void verPessoa() {
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] != null) {
                System.out.println("ALUNES " + (i + 1) + ":\n" + pessoa[i].toString()+"\n");
            }
        }
    }
    
    public void cadastro()
    {	
    	int op3;
    	do {
		    	Curso curso = new Curso("Engenharia Química");
		    	Scanner leia = new Scanner(System.in);
		    	Random aleatorio = new Random();
		    	System.out.println("\t\tOpções do sistema:\n[1] INSERIR\t[2] PROCURAR\t[3] EXCLUIR\t[4] VER LISTA DE PESSOAS");
				int op1 = leia.nextInt();
				if (op1 == 1)
				{
					for (int i = 0; i < this.pessoa.length; i++) {
						System.out.println("\n\t\tSISTEMA PARA CADASTRAR ALUNE");
						
						System.out.print("Digite o nome do alune: ");
						String nome = leia.next();
						
						System.out.print("Digite o CPF do alune (só digitos): ");
						String cpf = leia.next();
				
						
						System.out.print("Digite a idade do alune: ");
						int idade = leia.nextInt();
						
						long matricula = aleatorio.nextInt(15000)+1;
						int turma = aleatorio.nextInt(100)+1;
						System.out.println("Numéro de matricula gerado automaticamente: "+matricula);
						System.out.print("Numéro da turma: "+turma);
						leia.nextLine();
						
						
						System.out.println("\nALUNE MATRICULADO COM SUCESSO!!");
						Alune alune = new Alune(nome, idade,cpf, matricula, turma, curso);
						inserirPessoa(alune); 
					}
				}
				else if (op1 == 2) 
				{
					System.out.print("\nDigite o CPF do aluno:  ");
					String cpf = leia.next();
					System.out.println("INFORMAÇÕES\n"+procurarPessoa(cpf).toString()); 
				}
				else if (op1 == 4)
				{
					verPessoa();
				}
			System.out.println("\nDeseja continuar no sistema?\nDIGITE\t[0] para continuar no sistema\t[9] para sair.");
			op3 = leia.nextInt();
    		}while(op3 == 0);
    	
    }

	public void login() 
    {
    	Scanner leia = new Scanner(System.in);
    	System.out.println("Digite seu Cpf: ");
		String cpf = leia.nextLine();
		System.out.println(procurarPessoa(cpf).toString());
		
	} 

}
