package vetores;

import java.util.Scanner;

public class Exercicio6 {
//	6 - Construa um algoritmo que receba 5 notas e 5 nomes de alunos.
//	Os valores serão armazenados numa variável chamada nota que será um vetor,
//	e os nomes são armazenados numa variável chamada aluno que será um vetor.
//	Ao final do programa, o algoritmo deve imprimir a média da turma,
//	e dizer quem teve a maior nota e quem teve a menor nota, e por fim,
//	o algoritmo deve imprimir uma lista por ordem decrescente com base na nota.
//	Por exemplo:
//	----------Relatório da turma----------
//	Média da turma: 6,6
//	Aluno com maior nota: Júlio, 10pts
//	Aluno com menor nota: Marcos, 4pts
//	----------Lista de Alunos----------
//	Julio, 10pts
//	Julia, 9pts
//	Ana, 5pts
//	Pedro, 5pts
//	Marcos, 4pts
	public static void main(String[] args) {
		int nota[] = new int[5];
		String aluno[] = new String[5];
		double media, soma = 0;
		int maior = 0, menor = 0, auxiliar;
		String alunoMaior = null, alunoMenor = null, auxiliarNome = null;

		Scanner leia = new Scanner(System.in);

		for (int contador = 0; contador < nota.length; contador++) {
			System.out.print("Qual e o seu nome: ");
			aluno[contador] = leia.next();
			System.out.print("Qual foi a sua nota: ");
			nota[contador] = leia.nextInt();
			System.out.println();
			
			soma = soma + nota[contador];
			if (contador == 0) {
				maior = nota[contador];
				alunoMaior = aluno[contador];
				menor = nota[contador];
				alunoMenor = aluno[contador];
			}
			if (nota[contador] > maior) {
				maior = nota[contador];
				alunoMaior = aluno[contador];
			}
			if (nota[contador] < menor) {
				menor = nota[contador];
				alunoMenor = aluno[contador];
			}
		}
		media = soma / nota.length;
		for (int contadorA = 0; contadorA < nota.length; contadorA++) {
			for (int contadorB = 0; contadorB < contadorA; contadorB++) {
				if (nota[contadorA] > nota[contadorB]) {
					auxiliar = nota[contadorA];
					auxiliarNome = aluno[contadorA];
					nota[contadorA] = nota[contadorB];
					aluno[contadorA] = aluno[contadorB];
					nota[contadorB] = auxiliar;
					aluno[contadorB] = auxiliarNome;
				}
			}
		}
		System.out.println("----------Relatorio da turma----------");
		System.out.println("Media da turma: " + media);
		System.out.println("Aluno com maior nota: " + alunoMaior + ", " + maior);
		System.out.println("Aluno com menor nota: " + alunoMenor + ", " + menor);
		System.out.println("----------Lista de alunos-------------");
		for (int contador = 0; contador < nota.length; contador++) {
			System.out.println(aluno[contador]+", "+ nota[contador]+"pts");
		}
		System.out.println();
		System.out.println("Fim");
	}

}