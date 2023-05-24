package vetores;

import java.util.Scanner;

public class Exercicio_11 {
//	11 - Construa um algoritmo que receba 10 valores e os armazene dentro de um vetorA.
//	Depois crie um vetorB e armazene o conteúdo do vetorA * por 5.
//	Por exemplo:
//	Recebendo os valores do vetorA 	[5] [6] [2]
//	Atribuindo a outro vetorB		[25] [30] [10]
	public static void main(String[] args) {
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 0; contador < vetorA.length; contador++) {
			System.out.print("Digite um valor: ");
			vetorA[contador] = leia.nextInt();
			vetorB[contador] = vetorA[contador] * 5;
		}
		System.out.println();
		for(int contador = 0; contador < vetorA.length; contador++) {
			System.out.println(vetorA[contador] + " X 5 = " + vetorB[contador] + "; ");
		}
		System.out.println();
		System.out.print("Fim!");
	}

}
