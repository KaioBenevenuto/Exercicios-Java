package vetores;

import java.util.Scanner;

//1 - Construa um algoritmo que receba 5 valores e os armazene dentro de um vetor.
//    Após isso imprima esses valores do na tela.
public class Exercicio1 {

	public static void main(String[] args) {
	int valor[]	= new int[5];
	Scanner leia = new Scanner(System.in);
	
	for(int contador = 0;contador < 5; contador = contador + 1) {
		System.out.print("Digite um valor: ");
		valor[contador] = leia.nextInt(); 
	}
	System.out.println();
	for(int contador = 0;contador < 5; contador = contador + 1) {
		System.out.print(valor[contador]+";");
	}
	}

}
