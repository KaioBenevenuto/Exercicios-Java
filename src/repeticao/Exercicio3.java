package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int valor;
		Scanner leia = new Scanner(System.in); 
		do {
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
		} while (valor != 8);
		System.out.println("Fim!");
	}
}