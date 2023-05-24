package vetores;

import java.util.Scanner;

//5 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//Ao final imprima na tela em ordem crescente e decrescente.

public class Exercicio5_BubbleSort {


	public static void main(String[] args) {
		// Vetor
		// Vetores em linguagens de programação, sempre começam com 0
		Scanner leia = new Scanner(System.in);
		int valor[] = new int[5];
		int auxiliar = 0; 
		
		for (int contador = 0; contador < valor.length; contador = contador + 1) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
		}
		
		for(int contadorA = 0; contadorA < valor.length; contadorA++) {
			for(int contadorB = 0; contadorB < contadorA; contadorB++) {
				if(valor[contadorA] > valor[contadorB]) {
					auxiliar = valor[contadorA];
					valor[contadorA] = valor[contadorB];
					valor[contadorB] = auxiliar;
				}
			}
		}
		
		System.out.println();
		System.out.println("Decrescente");
		
		for(int contador = 0; contador < valor.length; contador = contador + 1) {
			System.out.print(valor[contador]+"; ");
		}
		
		System.out.println();
		System.out.println("Crescente");
		
		for(int contador = valor.length; contador > 0; contador = contador - 1) {
			System.out.print(valor[contador-1]+"; ");
		}
		System.out.println();
		System.out.println("Fim");
	}
}