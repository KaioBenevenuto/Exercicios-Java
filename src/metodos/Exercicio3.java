package metodos;

import java.util.Scanner;

public class Exercicio3 {
	// void é usado em metodos que não retornará 
	// Um String por exemplo, antes do nome do metodo significa que o valor que irá retorna será um String.
	public static void main(String[] args) {
		meuNome();	
	}
	
	public static void meuNome() {
		String nome;
		System.out.print("Digite seu nome: ");
		
		Scanner leia = new Scanner (System.in);
		nome = leia.nextLine();
		System.out.println("Oi " + nome);
		
	}
}
