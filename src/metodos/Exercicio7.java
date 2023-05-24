package metodos;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		imprimirIdade(idade);
	}
	public static void imprimirIdade(int idade) {
		System.out.print("Eu tenho " + idade + " anos.");
	}
}