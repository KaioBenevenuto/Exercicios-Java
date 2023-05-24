package metodos;

import java.util.Scanner;

public class Exercicio_11 {
//	11 - Construa um algoritmo que receba 11 valores e os armazene dentro de um vetor.
//	Após isso, crie um método de nome media,
//	que receba como parâmetros o vetor de valores.
//	Ao final, o método de retornar a média de valores.
	public static void main(String[] args) {
		double valor[] = new double[10], soma = 0, media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
		}
		media = mediador(valor);
		System.out.println("---------------------------------");
		System.out.println("A media dos valores e de: " + media);
		System.out.println("---------------------------------");
		System.out.println("Fim!");
	}
	public static double mediador(double[] valor) {
		double soma = 0, media = 0;
		for (int contador = 0; contador < valor.length; contador++) {
			 soma = valor[contador] + soma;
		}
		media = soma / valor.length;
		return media;
	}
}