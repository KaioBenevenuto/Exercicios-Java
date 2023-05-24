package metodos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int valor1 = 0 , valor2 = 0;
		double resultado, pesoDividido2;
		String helloWorld;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		valor1 = leia.nextInt();
		valor2 = leia.nextInt();
		resultado = soma(valor1, valor2);
		System.out.println("A soma dos dois e: " + resultado);
		
		imprimeLinha();
		helloWorld = mostraHelloWorld();
		System.out.println(helloWorld);
		imprimeLinha();
		
		 pesoDividido2 = calculaPesoDivididoPor2(leia);
		 System.out.println("O seu peso dividido por dois e: " + pesoDividido2);
	}
	public static double soma(int num1, int  num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	public static void imprimeLinha() {
		System.out.println("------------------------------");
	}
	public static String mostraHelloWorld() {
		return "Hello World";
	}
	public static double calculaPesoDivididoPor2(Scanner leia) {
		double peso = 0;
		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble();
		return peso / 2;
	}
	
}