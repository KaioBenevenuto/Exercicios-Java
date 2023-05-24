package matriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// linha | coluna
				String matriz[][] = new String[5][5];	
				
				for(int linha = 0; linha < matriz.length; linha++) {
					for(int coluna = 0; coluna < matriz[0].length; coluna++) {
						if(linha == coluna || linha + coluna == matriz.length - 1) {					
							matriz[linha][coluna] = "X"; 
						}else {
							matriz[linha][coluna] = "0"; 
						}
					}
				}
				
				for(int linha = 0; linha < matriz.length; linha++) {
					for(int coluna = 0; coluna < matriz[0].length; coluna++) {
						System.out.print(" ["+matriz[linha][coluna]+"] ");
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println("Fim");


	}
}