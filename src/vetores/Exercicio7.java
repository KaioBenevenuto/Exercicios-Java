package vetores;

import java.util.Scanner;

public class Exercicio7 {
//	7 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//	Ao final peça um valor ao usuário e diga se esse valor existe ou não no vetor.
//	Por exemplo:
//	Recebendo os valores do vetor [5] [6] [2]
//	Pedindo ao usuário um valor: 6
//	Imprimindo: O número 6 existe no vetor. O número 6 está na posição 1 do vetor
	public static void main(String[] args) {
		int valor[] = new int[5];
		int valor2, posicao = 0;

		Scanner leia = new Scanner(System.in);
		for (int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
		}
		System.out.println();
		System.out.print("Digite um valor: ");
		valor2 = leia.nextInt();

		for (int contador = 0; contador < valor.length; contador++) {
			if(valor[contador] == valor2) {
				posicao = contador;
			}
		}

		if (((((valor2 != valor[0]) && (valor2 != valor[1]) && (valor2 != valor[2]) && (valor2 != valor[3])
				&& (valor2 != valor[4]))))) {
			System.out.println("Esse numero nao esta em nenhuma posicao do vetor.");
		} else {
			System.out.println("O numero " + valor2 + " esta no vetor. Sendo que ele esta na posicao " + posicao +".");
		}

	}
}