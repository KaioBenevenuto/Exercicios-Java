package metodos;

import java.util.Scanner;

public class Exercicio_13 {
//	13 - Construa um algoritmo que receba 10 valores e os armazene dentro de um vetor.
//	Após isso, crie um método de nome infoVetor, que receba como parâmetros o vetor de valores.
//	Ao final, imprima na tela as seguintes informações do vetor.
//	- Qual é o maior valor, qual é o menor valor, qual é o tamanho do vetor,
//	qual é a média dos valores, quantos valores são maiores que 5.
	public static void main(String[] args) {
		int valor[] = new int[10];
		
		Scanner leia = new Scanner (System.in);
		
		for(int contador = 1; contador <= valor.length; contador++) {
			System.out.print("Digite o " + contador + "o valor: ");
			valor[contador-1] = leia.nextInt();
		}
		infoVetor(valor);
	}
	public static void infoVetor(int[] valor) {
		int maior = valor[0], menor = valor[0], quantMaior5=0;
		double  media = 0, soma = 0;
		for(int contador = 0; contador < valor.length; contador++) {
			if (valor[contador] > maior){
				maior = valor[contador];
			}
			if(valor[contador] < menor) {
				menor = valor[contador];
			}
			if (valor[contador] > 5) {
				quantMaior5 = quantMaior5 + 1;
			}
			soma = soma + valor[contador];
		}
		media = soma / valor.length;
		System.out.println("-----------------------------------");
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("-----------------------------------");
		System.out.println("Maiores que 5 = " + quantMaior5);
		System.out.println("-----------------------------------");
		System.out.println("Media = " + media);
		System.out.println("-----------------------------------");
		System.out.println("O vetor tem " + valor.length + " numeros.");
		System.out.println("-----------------------------------");
		System.out.println("Fim!");
	}
}