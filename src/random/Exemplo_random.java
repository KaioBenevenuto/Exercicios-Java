package random;

import java.util.Random;

public class Exemplo_random {

	public static void main(String[] args) {
		
		Random numAleatorio = new Random();

		// gera um valor aleatório entre dois número
		int n1 = numAleatorio.nextInt(99999 - 10000 + 1) + 10000;
		System.out.println(n1);

		// gera um valor double aleatório entre 0.0 e 1.0
		double n2 = numAleatorio.nextDouble();
		System.out.println(n2);

		// gera um valor boolean aleatório
		boolean n3 = numAleatorio.nextBoolean();
		System.out.println(n3);

		// gera um valor aleatório entre 1 e 10
		int n4 = numAleatorio.nextInt(10) + 1;
		System.out.println(n4);

	}

}
