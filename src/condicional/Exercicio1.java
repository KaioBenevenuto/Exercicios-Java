package condicional;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int valor1, valor2;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		valor1 = leia.nextInt();
		
		System.out.print("Digite outro valor: ");
		valor2 = leia.nextInt();
		
		if (valor1 == valor2) {
			System.out.print("O numero "+valor1+" e o numero "+valor2+" sao iguais");
		}
		else {
			System.out.print("O numero "+valor1+" e o numero "+valor2+" nao sao iguais");
		}
	}

}
