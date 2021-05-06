package exercicios;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		
		System.out.println("Os números entre 1000 e 1999 que obtem resto 5 ao ser dividido por 11 são: ");
		for(int i=1000; i<=1999;i++) {
			if(i%11==5) {
				System.out.println(i);
			}
		}

	}

}
