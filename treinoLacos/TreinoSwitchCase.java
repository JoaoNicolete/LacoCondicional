package treinoLacos;

import java.util.Scanner;

public class TreinoSwitchCase {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		
		String letra = entrada.nextLine();
		
		switch(letra) {
		
		case "a":
			System.out.println("Amor");
			break;
			
		case "b":
			System.out.println("Baixinho");
			break;
			
		case "c":
			System.out.println("Cora��o");
			break;
			
		case "d":
			System.out.println("Dado");
			break;
			
			default:
				System.out.println("n�o existe essa letra");
				break;
		
		}
		
		entrada.close();
		
	}

}
