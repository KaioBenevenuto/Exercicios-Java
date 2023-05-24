package repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int valor, contador, quantidade = 0;
		Scanner leia = new Scanner(System.in);
		contador = 0;
		do {
			contador = contador + 1;
			System.out.print("Digite o " + contador + "- valor: ");
			valor = leia.nextInt();
			if ((valor > 10) && (valor < 50)) {
				quantidade = quantidade + 1;
			}
		} while (contador != 5);
		System.out.println("A quantidade de numeros entre 10 e 50 e "+quantidade);

	}

}