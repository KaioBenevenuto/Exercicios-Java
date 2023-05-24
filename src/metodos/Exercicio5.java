package metodos;

public class Exercicio5 {

	public static void main(String[] args) {
		pai();
	}
	public static void pai() {
		String fraseP = "Meu filho chama jesus.";
		String filho = filho(fraseP);
		System.out.println(filho);
	}
	
	public static String filho(String fraseP) {
		return fraseP + " E eu estou na terra";
	}
}