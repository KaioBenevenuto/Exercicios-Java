package condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		double valor;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um valor decimal: ");
		valor = leia.nextDouble();
		if (valor > 15.5) {
			System.out.print(valor + " e maior que 15.5");
		} else if (valor < 15.5) {
			System.out.print(valor + " e menor que 15.5");
		} else {
			System.out.print(valor + " e igual a 15.5");
		}

	}

}
