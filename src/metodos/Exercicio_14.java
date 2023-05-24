package metodos;

import java.util.Scanner;

public class Exercicio_14 {
//	14 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//	Após isso, crie um método que receba como parâmetros o vetor de valores.
//	Ao final, o método de retornar o vetor multiplicado por 5.
//	Dica: O método irá retornar o vetor multiplicado por 5, 
//	e não imprimir na tela, a impressão na tela será feita no main.
	public static void main(String[] args) {
		int valor[] = new int[5], valorCopia[] = new int[5];
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();
			valorCopia[contador] = valor[contador];
		}
		 valor = x5(valor);
		 
		 for (int contador = 0; contador < valor.length; contador++) {
		 System.out.println("------------------------");
		 System.out.println(valorCopia[contador] + " X " + valor.length + " = " + valor[contador]);
		 }								
		 System.out.println("------------------------");
		 System.out.println("Fim!");
	}
	public static int[] x5 (int[] valor) {
		for (int contador = 0; contador < valor.length; contador++) {
			valor[contador] = valor[contador] * valor.length;
		}
		return valor;
	}
}