package condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor1, valor2;
		System.out.print("Digite um valor: ");
		valor1 = leia.nextInt();
		System.out.print("Digite outro valor: ");
		valor2 = leia.nextInt();

		if (valor1 != valor2) {
			System.out.print("O numero " + valor1 + " e diferente do numero " + valor2);
		} else {
			System.out.print("O numero " + valor1 + " e igual ao numero " + valor2);
		}
	}
}
