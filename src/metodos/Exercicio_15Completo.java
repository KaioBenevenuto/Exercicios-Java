
package metodos;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 15 - Construa um algoritmo que contenha o seguinte menu a) cadastrar pessoa
 * b) editar pessoa c) excluir pessoa d) listar pessoas e) sair da aplicação
 * 
 * Crie um método para cada opção. a) cadastrarPessoa(): retorna true em caso de
 * sucesso, ou false em caso de falha. b)
 * editarPessoa(nomePessoaPessoaASerEditada): irá editar o nomePessoa da pessoa
 * e sua idade. Irá retornar true em caso de sucesso, ou false em caso de falha.
 * c) excluirPessoa(nomePessoaPessoaASerExcluída): Irá excluir uma pessoa do
 * vetor. Irá retornar true em caso de sucesso, ou false em caso de falha. d)
 * listarPessoas(): Irá imprimir a lista de pessoas cadastradas. Sem retorno. Ao
 * cadastrar uma pessoa solicite nomePessoa e idade, e depois armazene dentro de
 * um vetor. O tamanho total do vetor é de 5.
 * 
 */
public class Exercicio_15Completo {
	static Scanner leia = new Scanner(System.in);
	static String nomePessoa[] = new String[3];
	static int idadePessoa[] = new int[3];

	public static void main(String[] args) {
		menu();
	}

	// String nomePessoa.equals("Kaio") (nomePessoa igual a Kaio?)
	// String !nomePessoa.equals("Kaio") (nomePessoa diferente de Kaio?)
	public static void menu() {
		String opcao = null;
		do {
			System.out.println("************ MENU ************");
			System.out.println("a) Cadastrar pessoa");
			System.out.println("b) Editar pessoa");
			System.out.println("c) Excluir pessoa");
			System.out.println("d) Listar pessoa");
			System.out.println("e) Sair da aplicação");
			opcao = leia.next();
			ecolhaOpcao(opcao);
		} while (!opcao.equals("e"));
		System.out.println("Fim");
	}

	public static void ecolhaOpcao(String opcaoEscolhida) {
		switch (String.valueOf(opcaoEscolhida)) {
		case "a":
			System.out.println("------------------------- CADASTRAR PESSOA -------------------------");
			boolean sucesso = cadastrar();
			if (sucesso) {
				System.out.println("Pessoa cadastrada.");
			} else {
				System.out.println("Erro. Limite de cadastro atingido.");
			}
			break;
		case "b":
			System.out.println("------------------------- EDITAR PESSOA -------------------------");
			/*
			 * Quando tem só um pessoa cadastrada por ex Kaio, se for para editar e colocar
			 * gustavo ele vai adicionar essa pessoa ao invés de falar que essa pessoa não
			 * existe.
			 * 
			 * quando todo mundo está cadastrado, ao tentar editar passando o nome que não
			 * existe ele fala que a pessoa tá editada porém não está editada
			 */
			boolean sucessoEdicao = editar();
			if (sucessoEdicao) {
				System.out.println("Pessoa editada.");
			} else {
				System.out.println("Erro ao editar pessoa.");
			}
			break;
		case "c":
			System.out.println("------------------------- EXCLUIR PESSOA -------------------------");
			boolean sucessoExclusao = excluir();
			if (sucessoExclusao) {
				System.out.println("Pessoa excluída.");
			} else {
				System.out.println("Erro ao excluir. Não é possível excluir ningúem, pois ninguém existe.");
			}
			break;
		case "d":
			System.out.println("------------------------- LISTAR PESSOA -------------------------");
			listar(nomePessoa, idadePessoa);
			break;

		default:
			break;
		}
	}

	public static boolean cadastrar() {
		// Verificar se o array de pessoa está vazio
		boolean arrayVazio = eVazio(nomePessoa);
		if (arrayVazio) {
			int posicao = eVazioPosicao(nomePessoa);
			String nome = null;
			int idade = 0;

			System.out.print("nomePessoa: ");
			nome = leia.next();

			System.out.print("Idade: ");
			idade = leia.nextInt();

			nomePessoa[posicao] = nome;
			idadePessoa[posicao] = idade;

			return true;
		} else {
			return false;
		}

	}

	public static boolean editar() {
		boolean arrayVazio = eVazioCompleto(nomePessoa);
		int posicao = 0;
		if (!arrayVazio) {
			String nome = null;
			int idade = 0;

			System.out.print("Digite o nome da pessoa a ser editada: ");
			nome = leia.next();

			posicao = posicaoPessoaPeloNome(nome);
			if (posicao != -1) {

				System.out.print("Nome: ");
				nome = leia.next();

				System.out.print("Idade: ");
				idade = leia.nextInt();

				nomePessoa[posicao] = nome;
				idadePessoa[posicao] = idade;
			}
			return true;
		} else {
			return false;
		}
	}

	public static boolean excluir() {
		boolean arrayVazio = eVazioCompleto(nomePessoa);
		if (!arrayVazio) {
			String nome = null;
			System.out.print("Digite o nome da pessoa a ser excluída: ");
			nome = leia.next();

			int posicao = posicaoPessoaPeloNome(nome);

			if (posicao != -1) {
				nomePessoa[posicao] = null;
				idadePessoa[posicao] = -1;
			}
			return true;
		} else {
			return false;
		}
	}

	public static boolean eVazio(String nomePessoa[]) {
		boolean vazio = false;
		for (int indice = 0; indice < nomePessoa.length; indice++) {
			if (nomePessoa[indice] == null || nomePessoa[indice].equals("")) {
				vazio = true;
			}
		}
		return vazio;
	}

	public static boolean eVazioCompleto(String nomePessoa[]) {
		boolean vazio = false;
		int somaVazio = 0;
		for (int indice = 0; indice < nomePessoa.length; indice++) {
			if (nomePessoa[indice] == null || nomePessoa[indice].equals("")) {
				somaVazio++;
			}
		}
		if (somaVazio == nomePessoa.length) {
			vazio = true;
		} else {
			vazio = false;
		}
		return vazio;
	}

	public static int eVazioPosicao(String nomePessoa[]) {
		boolean vazio = false;
		int posicao = 0;
		for (int indice = 0; indice < nomePessoa.length; indice++) {
			if (!vazio && nomePessoa[indice] == null) {
				vazio = true;
				posicao = indice;
			}
		}
		if (vazio) {
			return posicao;
		}
		return -1;
	}

	public static int posicaoPessoaPeloNome(String nome) {
		int posicao = -1;
		for (int indice = 0; indice < nomePessoa.length; indice++) {
			// 0 = ana			ana != null  ? true     ana == lucas ? false
			// 1 = null			null != null ? false    PRIMEIRA CONDIÇÃO DEU FALSA, ELE NEM FAZ O RESTANTE
			// 2 = lucas		lucas != null? true		lucas == lucas ? true
			if ((nomePessoa[indice] != null) && (nomePessoa[indice].equals(nome))) {
				posicao = indice;
			}
		}
		return posicao;
	}

	public static void listar(String nome[], int idade[]) {
		for (int indice = 0; indice < nomePessoa.length; indice++) {
			if (nome[indice] != null)
				System.out.println("[" + indice + "] - " + nome[indice] + ", " + idade[indice]);
		}
	}
}