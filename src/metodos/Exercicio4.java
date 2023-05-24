package metodos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int valor1 = 0, valor2 = 0, resultado1, resultado2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		valor1 = leia.nextInt();
		valor2 = leia.nextInt();
		resultado1 = soma (valor1, valor2);
		resultado2 = subtracao (valor1, valor2);
		
		System.out.println("-------------------------------------");
		System.out.println("A soma dos dois valores e: " + resultado1);
		System.out.println("-------------------------------------");
		System.out.println("A subtracao dos dois valores e: " + resultado2);
		System.out.println("-------------------------------------");
	
	}
	public static int soma (int v1,int v2) {
		int somaR = v1 + v2;
		return somaR;
	}
	public static int subtracao (int valor1,int valor2) {
		int subtracaoR = valor1 - valor2;
		return subtracaoR;
	}
}
