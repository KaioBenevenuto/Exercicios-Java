package metodos;

import java.util.Scanner;

public class Exercicio_12 {
//	12 - Construa um algoritmo que receba 10 valores e os armazene dentro de um vetor.
//	Após isso, crie um método de nome maior, que receba como parâmetros o vetor de valores.
//	Ao final, o método de retornar qual é o maior valor.
	public static void main(String[] args) {
		int valor[] = new int[10], maior = 0;
		Scanner leia = new Scanner (System.in);
		
		for(int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
		}
		maior = maiorNumero(valor);
		System.out.println("--------------------------------");
		System.out.println("O maior numero digitado e o " + maior);
		System.out.println("Fim!");
	}
	public static int maiorNumero (int[] valor) {
		int maior = valor[0];
		for(int contador = 0; contador < valor.length; contador++) {
			if(valor[contador] > maior) {
				maior = valor[contador];
			}
		}
		return maior;
	}
}