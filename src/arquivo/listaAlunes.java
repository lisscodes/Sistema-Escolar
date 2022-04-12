package arquivo;

import java.util.ArrayList;
import java.util.Scanner;
import sistema_escolar.BancoDados;
import sistema_escolar.Pessoa;

public class listaAlunes implements BancoDados{

	@Override
	public void inserirAlune(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa procurarAlune(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerAlune(String cpf) {
		// TODO Auto-generated method stub
		
	}
	
	public void menuCoordenação()
	{
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> nome = new ArrayList();
		ArrayList<String> cpf = new ArrayList();
		
		do
		{
			System.out.println("\n============================================");
			System.out.println("\n[1] Inserir alunes\t[2] Remover alunes");
			System.out.println("\n[3] Procurar alunes\t[4] Lista de alunes\n\n[0] Finalizar o sistema");
			System.out.println("\n============================================");
			System.out.print("\nDigite uma opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.print("\nDigite o nome do alune: ");
				String nomeAlune = leia.nextLine();
				nome.add(nomeAlune);
				leia.nextLine();
				System.out.print("\nDigite seu CPF: ");
				String cpfAlune = leia.nextLine();
				cpf.add(cpfAlune);
				System.out.println("\n\nAlune matriculado no sistema.");
				leia.nextLine();
				break;
			case 2:
				leia.nextLine();
				System.out.print("\nDigite o nome do alune: ");
				String removeNome = leia.nextLine();
				System.out.print("\nDigite o cpf do alune: ");
				String removeCpf = leia.nextLine();
				if(nome.contains(removeNome) && cpf.contains(removeCpf))
				{
					nome.remove(removeNome);
					cpf.remove(removeCpf);
				}
				else
				{
					System.out.println("\nAlune não existente...");
				}
				System.out.println("\nAlune removido do sistema!!!");
				break;
			case 3:
				leia.nextLine();
				System.out.print("\nDigite o nome do alune: ");
				String procuraAlune = leia.nextLine();
				System.out.print("\nDigite o cpf do alune: ");
				String procuraCpf = leia.nextLine();
				if(nome.contains(procuraAlune) && cpf.contains(procuraCpf))
				{
					System.out.println(nome);
					System.out.println(cpf);
					
				}
				else
				{
					System.out.println("\nAlune não existente...");
				}
				break;
			case 4:
				System.out.println("\nLista de alunes matriculados: ");
				System.out.println(nome);
				System.out.println(cpf);
				break;
			default:
				if(op<0 || op>4)
				{
					System.out.println("\nOpção errada... Digite uma nova opção...");
				}
				else
				{
				System.out.println("\nFinalizou o programa...");
				}
			}
		}while(op !=0);
		
	}
	
	public void consultaAlune() {
		// TODO Auto-generated method stub
		ArrayList<String> nome = new ArrayList();
		ArrayList<String> cpf = new ArrayList();
		Scanner leia = new Scanner(System.in);
		leia.nextLine();
		System.out.print("\nDigite o nome do alune: ");
		String consultaNome = leia.nextLine();
		System.out.print("\nDigite o cpf do alune: ");
		String consultaCpf = leia.nextLine();
		if(nome.contains(consultaNome) && cpf.contains(consultaCpf))
		{
			System.out.println("\nAlune encontrado!!");
			
		}
		else
		{
			System.out.println("\nAlune não existente...");
		}
	}

}


