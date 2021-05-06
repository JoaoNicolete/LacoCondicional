package exercicios;

import java.util.Scanner;

public class Exercicio6 {
/*Escrever um programa que receba vários números inteiros no teclado. E no
*final imprimir a média dos números múltiplos de 3. Para sair digitar
*0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, media=0, soma=0, contador=0;
		
		do {
			System.out.println("Insira um número: ");
			numero = ler.nextInt();
			
			if(numero%3==0) {
				contador++;
				soma=soma+numero;
				media = soma/contador;
			}
			
		} while(numero!=0);
		
		System.out.println("A media dos múltiplos de 3 é " + media);
		
		ler.close();
	}
}
