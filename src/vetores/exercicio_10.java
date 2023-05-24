package vetores;

import java.util.Scanner;

public class exercicio_10 {
//	10 - Construa um algoritmo que receba 10 valores e os armazene dentro de um vetor,
//	depois crie um outro vetor que receberá o inverso do primeiro vetor. Ao final imprima os dois na tela
//	Por exemplo:
//	Recebendo os valores do vetor 	[5] [6] [2]
//	Atribuindo a outro vetor o inverso	[2] [6] [5]
//	Imprimindo os dois vetores na tela
	public static void main(String[] args) {
		int valor1[] = new int[10];
		int valor2[] = new int[10];
		int auxiliar = 0;

		Scanner leia = new Scanner(System.in);

		// Pegando valor1
		for (int contador = 0; contador < valor1.length; contador++) {
			System.out.print("Digite um valor: ");
			valor1[contador] = leia.nextInt();
		}
		
		// Atribuir valor2 com o inverso de valor1
		for(int contador = valor1.length; contador > 0; contador--) {
			valor2[auxiliar] = valor1[contador - 1];
			auxiliar++;
//			0 = 9
//			1 = 8
//			2 = 7
		}
		
		System.out.println();
		System.out.println("Normal:");
		for (int contador = 0; contador < valor1.length; contador++) {
			System.out.print(valor1[contador] + ";");
		}
		
		System.out.println();
		System.out.println("Inverso:");
		for (int contador = 0; contador < valor2.length; contador++) {
			System.out.print(valor2[contador] + ";");
		}
		System.out.println();
		System.out.println("Fim!");
	}
}