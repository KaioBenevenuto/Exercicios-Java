package metodos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int idade;
		boolean maiorIdade;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		maiorIdade  = maiorOuMenorQue18 (idade);
		
		System.out.println(maiorIdade);
		
		System.out.println("Fim!");
	}

		public static boolean maiorOuMenorQue18 (int idade) {
			boolean resultado = true;
			if (idade > 18) {
				resultado = true;
			} else if (idade < 18) {
				resultado = false;
			}
			return resultado;
		}
}
