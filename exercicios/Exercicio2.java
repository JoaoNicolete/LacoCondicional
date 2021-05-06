package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int contador, numero, par=0, impar=0;
		
		for(contador=0; contador<10; contador++) {
			System.out.println("Insira seu número: ");
			numero = ler.nextInt();
			
			if(numero%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("O número de números pares é: " + par);
		System.out.println("O número de números impares é: " + impar);
		
		ler.close();
		

		}

}
