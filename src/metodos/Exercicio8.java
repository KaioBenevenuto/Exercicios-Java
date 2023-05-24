package metodos;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int valor[] = new int[10];
		String parImpar[] = new String[10];
		
		Scanner leia = new Scanner(System.in); 
		
		for(int contador = 0; contador < valor.length; contador++) {
			System.out.print("Digite um valor: ");
			valor[contador] = leia.nextInt();	
			parImpar[contador] = imparPar(valor[contador]);
		}
		System.out.println("----------------------");
		for(int contador = 0; contador < valor.length; contador++) {
			System.out.println("O numero " + valor[contador] + " e " + parImpar[contador]);
		}
	}
	

	public static String imparPar(int valor) {
		String parImpar = null;	
		if (valor % 2 == 0) {
			parImpar = "Par";
		} else {
			parImpar = "Impar";
			}
		return parImpar;
	}
}
