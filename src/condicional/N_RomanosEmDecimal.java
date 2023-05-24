package condicional;

import java.util.Scanner;

public class N_RomanosEmDecimal {
	public static void main(String[] args) {
		String Nromano;
		int Ndecimal = 0;
		Scanner Leia = new Scanner(System.in);


		System.out.println("---------------");
		System.out.println("|  [V]   [X]  |");
		System.out.println("|  [L]   [C]  |");
		System.out.println("|  [D]   [M]  |");
		System.out.println("---------------");

		System.out.println("Digite um número Romano mostrado acima");
		System.out.println();
		System.out.print("Romano: ");
		Nromano = Leia.nextLine();

		if (Nromano.equals("V")) {
			Ndecimal = 5;
		} else if (Nromano.equals("X")) {
			Ndecimal = 10;
		} else if (Nromano.equals("L")) {
			Ndecimal = 50;
		} else if (Nromano.equals("C")) {
			Ndecimal = 100;
		} else if (Nromano.equals("D")) {
			Ndecimal = 500;
		} else if (Nromano.equals("M")) {
			Ndecimal = 1000;
		}else {
			System.out.println("Esse número não esta no catálogo acima");
		}

		if(Ndecimal > 0) {
			System.out.print("Decimal: " + Ndecimal);
		}
	}
}
