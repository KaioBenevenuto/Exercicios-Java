package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int valor, contador, maior, menor;
		contador = 1;
		maior = 0;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o " + contador + "- valor: ");
		valor = leia.nextInt();
		menor = valor;
		
		if (valor > maior) {
			maior = valor;
		} else if (valor < menor) {
			menor = valor;
		}
		
		do {
			contador = contador + 1;
			System.out.print("Digite o " + contador + "- valor: ");
			valor = leia.nextInt();
			
			if (valor > maior) {
				maior = valor;
			} else if (valor < menor) {
				menor = valor;
			}
			
		} while (contador < 5);
		System.out.println();
		System.out.println("O maior valor e "+maior);
		System.out.println("O menor valor e "+menor);
		System.out.print("Fim");
	}

}
//2 - Construa um algoritmo que receba 5 valores e imprima qual é o maior e qual é o menor.
//	public static void main(String[] args) {
//		int contador, valor, maior = 0, menor = 0;
//		Scanner leia = new Scanner(System.in);
//		
//		for(contador = 0; contador < 5; contador = contador + 1) {
//			System.out.print("Digite o "+(contador+1)+" valor: ");
//			valor = leia.nextInt();
//			
//			// Primeira repetição
//			if(contador == 0) {
//				maior = valor;
//				menor = valor;
//			}
//			
//			if(valor < menor) {
//				menor = valor;
//			}
//			
//			if(valor > maior) {
//				maior = valor;
//			}
//			
//		}
//		System.out.println("Maior valor: "+maior);
//		System.out.println("Menor valor: "+menor);
//		
//		System.out.print("Fim");
//	}