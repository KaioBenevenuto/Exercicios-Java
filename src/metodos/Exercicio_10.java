package metodos;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		double media = 0, soma = 0, nota[] = new double[10];
		
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 0; contador < nota.length; contador++) {
			System.out.print("Qual e a sua nota: ");
			nota[contador] = leia.nextInt();
			soma = mediador(nota[contador], soma);
		}
		media = soma / nota.length;
		System.out.println("---------------------------");
		System.out.println("A media da turma e de " + media);
		System.out.println("---------------------------");
		System.out.println("Fim.");
	}
	public static double mediador(double nota, double somaNota) {
		somaNota = nota + somaNota;
		return somaNota;
	}
}