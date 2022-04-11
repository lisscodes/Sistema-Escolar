package sistema_escolar;

import java.util.Scanner;
import arquivo.BancoDadosArray;
import java.util.Random;


public class Programa {

    public static void main(String[] args) {
    
    	int op, ops;
		
    	Scanner leia = new Scanner(System.in);
    	Random aleatorio = new Random();
		BancoDadosArray dados = new BancoDadosArray(2);
		
		System.out.println("SISTEMA EDUCACIONAL");

		do {
			System.out.print("Escolha seu portal de login:\n[1] ALUNE\n[2] DOCENTE\n[3] COORDENAÇÃO\n\n");
			op = leia.nextInt();
		
			
				if (op == 1) 
				{
					dados.login();
				}
				
				if (op == 2) 
				{
					dados.login();
				}
				
				if (op == 3)
				{
					dados.cadastro();
				}
				
				if (op > 3)
				{
					System.out.println("Opção inválida, Digite a opção desejada.\n");
				}
				
			System.out.println("Deseja continuar no Sistema Educacional? Digite:\n[0] Continuar\n[1] Sair");
			ops = leia.nextInt();
		}while(ops == 0);
		
		
    }
}

