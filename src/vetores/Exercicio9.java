package vetores;

import java.util.Scanner;

public class Exercicio9 {
//	9 - Construa um algoritmo que receba 10 valores e os armazene dentro de um vetor.
//	Depois crie um vetor de par e outro vetor de ímpar com base no vetor de 10 posições.
//	Por exemplo:
//	Recebendo os valores do vetor [5] [6] [2] [3] [9]
//	vetor de par = [6] [2]
//	vetor de impar = [5] [3] [9]
//	Imprimir os vetores de par e de ímpar
	public static void main(String[] args) {
		int valor[] = new int[10];
		int par[] = new int[10];
		int impar[] = new int[10];

		Scanner leia = new Scanner(System.in);

		for (int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
			if (valor[contador] % 2 == 0) {
				par[contador] = valor[contador];
			} else {
				impar[contador] = valor[contador];
			}
		}
		System.out.println();
		System.out.println("Par:");
		for (int contador = 0; contador < valor.length; contador++) {
			if (par[contador] != 0) {
				System.out.print(par[contador] + ";");
			}
		}
		System.out.println();
		System.out.println("Impar:");
		for (int contador = 0; contador < valor.length; contador++) {
			if (impar[contador] != 0) {
				System.out.print(impar[contador] + ";");
			}
		}
	}

}