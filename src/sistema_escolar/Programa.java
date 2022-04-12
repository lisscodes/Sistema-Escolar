package sistema_escolar;

import java.util.ArrayList;

import java.util.Scanner;


public class Programa {

    public static void main(String[] args) {
    	
    	
    	int op;
		Scanner leia = new Scanner(System.in);
		Professor prof1 = new Professor("Luís Guerreiro", "***********", 32.893);
		Professor prof2 = new Professor("Kelly Knoblauch", "**********", 50.893);
		Curso curso1 = new Curso("Pessoa desenvolvedore WEB JAVA full stack");
		Curso curso2 = new Curso("Pessoa desenvolvedore .NET");
		ArrayList<String> nome = new ArrayList();
		ArrayList<String> cpf = new ArrayList();
		
		
		System.out.println("\n\tSISTEMA ESCOLAR DELAAX");
		do
		{
			System.out.println("\n================================================");
			System.out.println("\n[1] Inserir alunes\t[2] Remover alunes");
			System.out.println("\n[3] Procurar alunes\t[4] Lista de alunes");
			System.out.println("\n[5] Infos Professore\t[6] Infos Curso");
			System.out.println("\n[0] Finalizar o sistema");
			System.out.println("\n================================================");
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
			case 5:
				System.out.println(prof1.toString()); 
				System.out.println(prof2.toString()); 
					break;
			case 6:
				System.out.println(curso1.toString());
				System.out.println(curso2.toString());
					break;
			default:
				if(op<0 || op>6)
				{
					System.out.println("\nOpção errada... Digite uma nova opção...");
				}
				else
				{
				System.out.println("\nFinalizou o programa...");
				}
			}
		}while(op !=0);
    	leia.close();
    }		
}

