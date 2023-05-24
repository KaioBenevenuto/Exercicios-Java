package repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int opcao, soma, subtracao, valor1, valor2, contador;
		Scanner leia = new Scanner(System.in);
		do {
			contador = 0;
			System.out.println("------------------------------");
			System.out.println("[1] para somar dois valores");
			System.out.println("[2] para subtrair dois valores");
			System.out.println("[0] para encerrar");
			System.out.println("------------------------------");
			opcao = leia.nextInt();
			System.out.println();
			switch (opcao) {
			case 1:
				System.out.print("Digite um valor: ");
				valor1 = leia.nextInt();
				System.out.print("Digite outro valor: ");
				valor2 = leia.nextInt();
				soma = valor1 + valor2;
				System.out.println("A soma dos dois valores e igual a " + soma);
				break;
			case 2:
				System.out.print("Digite um valor: ");
				valor1 = leia.nextInt();
				System.out.print("Digite outro valor: ");
				valor2 = leia.nextInt();
				subtracao = valor1 - valor2;
				System.out.println("A subtracao dos dois valores e igual a " + subtracao);
				break;
			default:
				if (opcao != 0) {
					System.out.println("Escolha uma das opcoes.");
				}
			}

		} while (opcao != 0);
		System.out.println("Fim!");

	}

}