package vetores;

import java.util.Scanner;

public class Exercicio8 {
//	8 - Construa um algoritmo que receba 10 valores e atribua o valor 0 para todos elementos que possuem o valor negativo.
//	Ao final imprima o vetor no tela
	public static void main(String[] args) {
		int valor[] = new int[10];

		Scanner leia = new Scanner(System.in);

		for (int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
			if (valor[contador] < 0) {
				valor[contador] = 0;
			}
		}
		System.out.println();
		for (int contador = 0; contador < valor.length; contador++) {
			System.out.print(valor[contador] + ";");
		}
	}

}