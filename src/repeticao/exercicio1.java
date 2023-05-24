package repeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		double valor;
		int contador;
		Scanner leia = new Scanner(System.in);
		contador = 0;
		do {
			contador = contador + 1;
			System.out.print("Digite o " + contador + "o valor: ");
			valor = leia.nextDouble();

			if (valor > 10.5) {
				System.out.println("O numero " + valor + " e maior que 10,5.");
			} else if (valor < 10.5) {
				System.out.println("O numero " + valor + " e menor que 10,5.");
			} else {
				System.out.println("O numero " + valor + " e igual a 10,5.");
			}
			System.out.println();
		} while (contador < 5);
		System.out.print("Fim");
	}
}