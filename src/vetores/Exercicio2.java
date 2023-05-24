package vetores;

import java.util.Scanner;

//2 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//Após isso multiplique os valores armazenados por 2  e os armazene no mesmo vetor.
//No final imprima os valores tela.
//Por exemplo 
//Recebendo os valores = [3], [2], [5]
//Multiplicando por 2 = [6], [4], [10]
//Mostrando na tela os valores
public class Exercicio2 {

	public static void main(String[] args) {
		int valor[] = new int[5];
		Scanner leia = new Scanner(System.in);

		for (int contador = 0; contador < 5; contador = contador + 1) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
			valor[contador] = valor[contador] * 2;
			System.out.println("esse mesmo valor multiplicado por 2 e igual a " + valor[contador]);
			System.out.println();
		}
		System.out.print("Fim!");
	}

}