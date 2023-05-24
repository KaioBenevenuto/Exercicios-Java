package repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int valor, contador, somaPar, somaImpar;
		contador = 0;
		somaPar = 0;
		somaImpar = 0;
		Scanner leia = new Scanner(System.in);

		do {
			contador = contador + 1;
			System.out.print("Digite um numero: ");
			valor = leia.nextInt();
			if (valor % 2 == 0) {
				somaPar = somaPar + 1;
			} else {
				somaImpar = somaImpar + 1;
			}

		} while (contador != 5);
		System.out.println();
		if (somaPar == 1) {
			System.out.println("A " + somaPar + " valor par.");
		} else {
			System.out.println("A " + somaPar + " valores pares.");
		}
		if (somaImpar == 1) {
			System.out.println("A " + somaImpar + " valor impar.");
		} else {
			System.out.println("A " + somaImpar + " valores impares.");
		}
		System.out.println("Fim!");
	}

}