package vetores;

import java.util.Scanner;

//4 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//Ao final imprima na tela qual é o maior e qual é o menor
public class Exercicio4 {

	public static void main(String[] args) {
		int valor[] = new int[5];
		int maior = 0 , menor = 0;
		Scanner leia = new Scanner (System.in); 
		
		
		for(int contador = 0; contador < 5;contador = contador + 1){
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
			if(contador == 0) {
				maior = valor[contador];
				menor = valor[contador];
			}
			if (valor[contador] > maior) {
				maior = valor[contador];
			}
			if (valor[contador] < menor) {
				menor = valor[contador];
			}
		}
		System.out.println("O maior valor e "+maior);
		System.out.println("O menor valor e "+menor);
	}
}