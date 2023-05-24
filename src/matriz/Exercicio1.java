package matriz;

import java.util.Scanner;

public class Exercicio1 {
//	1 - Declare uma matriz 4x2 e faça com que o usuário a preencha.
//	No final peça um número aleatório ao usuário e pesquise se o valor existe na matriz.
//	Por exemplo
//	Preenchendo matriz: 	    [2] [1]
//			            [3] [9]
//	Pedido ao usuário um valor: 3
//	Imprimindo na tela: O valor 3 existe na posição [1,1] da matriz.
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// linha | coluna
		int matriz[][] = new int[4][2], valorBuscar = 0, auxiliarLinha = -1, auxiliarColuna = -1;	
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print("Digite um valor ["+linha+"] ["+coluna+"]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite um valor para buscar: ");
		valorBuscar = leia.nextInt();
		
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				if(valorBuscar == matriz[linha][coluna]) {
					auxiliarLinha = linha;
					auxiliarColuna = coluna;
				}
				System.out.print("["+matriz[linha][coluna]+"]");
			}
			System.out.println();
		}
		
		if(auxiliarLinha != -1 && auxiliarColuna != -1) {
			System.out.println("Valor encontrado na posicao ["+auxiliarLinha+"] ["+auxiliarColuna+"] ");
		}else {
			System.out.println("Nenhum valor encontrado na matriz");
		}
		
		System.out.println();
		System.out.println("Fim");
	}
}