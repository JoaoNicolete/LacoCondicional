package exercicios;

import java.util.Scanner;

public class exercicio5 {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
	*n�mero igual a zero. No final, mostre a soma dos n�meros
	*digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma=0;
		
		do {
			System.out.println("Insira um n�mero: ");
			numero = ler.nextInt();
			
			soma = soma+numero;
		} while(numero!=0);
		
		System.out.println("A soma dos n�meros � " + soma);
		
		ler.close();
	}

}
