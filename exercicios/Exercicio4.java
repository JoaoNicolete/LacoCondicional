package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
/*Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
	*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	*idade for =-99.*/
	public static void main(String[] args) {
		int idade=0, maior=0, menor=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		while(idade!=-99) {
			System.out.println("Insira a idade: ");
			idade = ler.nextInt();
			
			if(idade<=21) {
				menor++;
			}
			if(idade>=50) {
				maior++;
			}
		}
		
		System.out.println("O n�mero de pessoas menor de 21 � de: " + menor);
		System.out.println("O n�mero de pessoas maior de 50 � de: " + maior);
		
		ler.close();
	}

}
