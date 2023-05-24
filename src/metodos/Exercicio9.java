package metodos;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int valor1, valor2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		valor1 = leia.nextInt();
		System.out.print("Digite outro valor: ");
		valor2 = leia.nextInt();
		maiorMenor(valor1, valor2);

	}
	public static void maiorMenor(int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.println("--------------------");
			System.out.println("O maior e o "+ valor1);
			System.out.println("O menor e o "+ valor2);
		}else if (valor1 < valor2) {
			System.out.println("--------------------");
			System.out.println("O maior e o "+ valor2);
			System.out.println("O menor e o "+ valor1);
		}
	}
}