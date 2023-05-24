package vetores;

import java.util.Scanner;

//3 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//Ao final imprima na tela a média desses 5 valores.
public class Exercicio3 {

	public static void main(String[] args) {
		int valor[] = new int[5];
		double soma = 0, media;
		Scanner leia = new Scanner(System.in);

		for (int contador = 0; contador < 5; contador = contador + 1) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
			soma = valor[contador] + soma;
		}
		media = soma / valor.length; 
		System.out.println("A media dos cinco valores e igual a " + media);
	}
}