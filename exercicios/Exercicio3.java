package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		*psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		*era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		*(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		*agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		*pessoas, calcule e mostre:
		*/
		
		Scanner ler = new Scanner(System.in);
		int idade, sexo, humor, contador=0, numeroCalmas=0, mulheresNervosas=0, homemAgressivo=0;
		int outrosCalmos=0, adultosNervosos=0, jovensCalmos=0;
		
		while(contador<=150){
			contador++;
			System.out.println("Escreva sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Escreva seu sexo, sendo 1-feminino, 2-masculino e 3-outros: ");
			sexo = ler.nextInt();
			
			System.out.println("Escreva seu humor, sendo 1-calmo, 2-nervoso e 3-agressivo: ");
			humor = ler.nextInt();
			
			if (humor==1) {
				numeroCalmas++;
			}
			if(sexo==1 && humor==2) {
				mulheresNervosas++;
			}
			if(sexo==2 && humor==3) {
				homemAgressivo++;
			}
			if(sexo==3 && humor==1) {
				outrosCalmos++;
			}
			if(idade>=40 && humor==2) {
				adultosNervosos++;
			}
			if(idade<=18 && humor==1) {
				jovensCalmos++;
			}
		}
		System.out.println("O número de pessoas calmas é: " + numeroCalmas);
		System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
		System.out.println("O número de homens agressivos é: " + homemAgressivo);
		System.out.println("O número de não-binários calmos é: " + outrosCalmos);
		System.out.println("O número de pessoas maiores de quarenta nervosos é: " + adultosNervosos);
		System.out.println("O número de menores de 18 calmos é: " + jovensCalmos);
		
		ler.close();
		
	}

}
