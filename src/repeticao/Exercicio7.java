package repeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int valorInicial, valorMarca, contador;
		contador = 0;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		valorInicial = leia.nextInt();
		valorMarca = valorInicial;
		System.out.println("do-while");
		do {
			System.out.print(valorInicial + ";");
			valorInicial = valorInicial - 1;
		} while (valorInicial > -1);
		System.out.println();
		System.out.print("0;");
		valorInicial = valorMarca;
		contador = valorInicial - 1;
		valorInicial = valorInicial - contador;
		do {
			System.out.print(valorInicial + ";");
			valorInicial = valorInicial + 1;
		} while (valorMarca != valorInicial);
		System.out.print(valorInicial+";");

		System.out.println();
		System.out.println();
		
		System.out.println("while");
		while (valorInicial >= 0) {
			System.out.print(valorInicial + ";");
			valorInicial = valorInicial - 1;
		}
		System.out.println();
		while (valorInicial != valorMarca) {
			valorInicial = valorInicial + 1;
			System.out.print(valorInicial + ";");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("for");
		for(valorInicial = valorMarca; valorInicial >= 0; valorInicial = valorInicial - 1) {
			System.out.print(valorInicial+";");
		}
		System.out.println();
		for(valorInicial = 0; valorInicial <= valorMarca; valorInicial = valorInicial + 1) {
			System.out.print(valorInicial+";");
		}
	}
}
//Por exemplo 3 = 3, 2, 1, 0.
// Obs: Faça o mesmo exercício usando o FOR o WHILE e o DO WHILE
//	public static void main(String[] args) {
//		int contador = 0, valor;
//		Scanner leia = new Scanner(System.in);
//		
//		System.out.print("Digite um valor: ");
//		valor = leia.nextInt();
//		
//		System.out.println("FOR");
//		for(contador = 0; contador <= valor; contador = contador + 1) {
//			System.out.print(contador);
//		}
//		
//		System.out.println();
//		
//		for(contador = valor; contador >= 0; contador = contador - 1) {
//			System.out.print(contador);
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//
//		System.out.println("DO-WHILE");
//		
//		contador = 0;
//		do {
//			System.out.print(contador);
//			contador = contador + 1;
//		} while (contador <= valor);
//
//		System.out.println();
//		
//		contador = valor;
//		do {
//			System.out.print(contador);
//			contador = contador - 1;
//		} while (contador >= 0);
//		
//		System.out.println();
//		System.out.println();
//		
//
//		System.out.println("WHILE");
//
//		contador = 0;
//		while (contador <= valor) {
//			System.out.print(contador);
//			contador = contador + 1;
//		}
//
//		System.out.println();
//		
//		contador = valor;		
//		while (contador >= 0) {
//			System.out.print(contador);
//			contador = contador - 1;
//		}
//
//		System.out.println();
//		System.out.println();
//		
//		System.out.print("Fim");
//	}