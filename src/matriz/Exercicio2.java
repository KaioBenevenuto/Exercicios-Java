package matriz;

import java.util.Scanner;

public class Exercicio2 {
//	2 - Leia uma matriz de 5x5, conte e imprima na tela quantos valores maiores que 10 ela possui.
//	Por exemplo: 
//	Preenchendo matriz: 	    [2] [11]
//			            [30] [9]
//	Imprimindo na tela: Essa matriz possui 2 valore maiores que 10
	public static void main(String[] args) {
		int matriz [][] = new int [5][5];
		int maior10 = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < 5; linha++ ) {
			for(int coluna = 0; coluna < 5; coluna++ ) {
				System.out.print("Digite um valor para fica na posicao " + linha + ","+coluna + ": ");
				matriz[linha][coluna] = leia.nextInt();
				if (matriz[linha][coluna] > 10) {
					maior10++;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("A quantidade de numeros na matriz maior que 10 e: "+ maior10);
		System.out.println("Fim!");
	}
}