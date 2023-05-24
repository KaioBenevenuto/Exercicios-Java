package metodos;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		int opcao, idade[] = new int[5], contador = 0,contadorA = 0, idadeAuxiliar = 0;
		String nome[] = new String[5];
		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 0; contador < nome.length; contador++) {
			nome[contador] = "";
		}
		contador = 0;
		do {
		System.out.println("------------------------");
		System.out.println("[1] Cadastrar pessoas  |");
		System.out.println("[2] Editar pessoas     |");
		System.out.println("[3] Excluir pessoas    |");
		System.out.println("[4] Listar pessoas     |");
		System.out.println("[0] Sair da aplicacao  |");
		System.out.println("------------------------");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			nome = cadastro(nome, contador);
			idade = cadastroIdade(idade, contador);
			if ((nome[contador] == null) && (idade[contador] == -1)){
				do {
					nome = cadastroDeletado(nome, contadorA);
					idade = cadastroIdadeDeletado(idade, contadorA);
					contadorA++;
				}while (contadorA != 5);
			}
			contador++;
			if(contador > 4) {
				contador = 0;
				contadorA = 0 ;
			}
			boolean arrayVazio = false;
			for(int contadorB = 0; contadorB < nome.length; contadorB++) {
				if ((nome[contadorB] == "") || (nome[contadorB] == null)){
					arrayVazio = true;
				}
			}
//			if((((((((((nome[0] != "") && (nome[1] != "") && (nome[2] != "") && (nome[3] != "") && (nome[4] != "") && (nome[0] != null) && (nome[1] != null) && (nome[2] != null) && (nome[3] != null) && (nome[4] != null)))))))))) {
			if(!arrayVazio) {
				System.out.println("------------------------------");
				System.out.println("Todas as vagas estao ocupadas.");
				System.out.println("------------------------------");
			}else {
				System.out.println("---------------------------------------------------");
				System.out.println("Digite mais 1 ou 4 vezes para cadastra-se novamente"); 
				System.out.println("---------------------------------------------------");
			}
		break;
		case 2:
			nome = edit(nome, idade, idadeAuxiliar);
		break;
		case 3:
			nome = delete(nome);
			idade = deleteIdade(idade, nome);
		break;
		case 4: 
			listar(nome, idade);
		break;
		default:
			if (opcao != 0) {
			System.out.println("Escolha uma das opcoes mostrada");
			}	
		}
		}while(opcao != 0);
		System.out.println("ENCERRANDO...");
	}
	public static String[] cadastro(String[] nome, int contador){
		Scanner leia = new Scanner(System.in);
		int contador2 = contador + 1;
		while((contador < contador2) && (contador2 <= nome.length))  {
			if ((nome[contador] == "")) {
				System.out.print("Digite seu nome: ");
				nome[contador] = leia.nextLine();
			} 
			contador++;
		}
		return nome;
	}
	public static int[] cadastroIdade(int[] idade, int contador){
		Scanner leia = new Scanner(System.in);
		int contador2 = contador + 1;
		while((contador < contador2) && (contador2 <= idade.length))  {
			if (idade[contador] == 0){
				System.out.print("Digite sua idade: ");
				idade[contador] = leia.nextInt();
			} 
			System.out.println();
			contador++;
		}
		return idade;
	}
	public static String[] cadastroDeletado(String[] nome, int contadorA){
		Scanner leia = new Scanner(System.in);
		int contador2 = contadorA + 1;
		while((contadorA < contador2) && (contador2 <= nome.length))  {
			if ((nome[contadorA] == null)) {
				System.out.print("Digite seu nome: ");
				nome[contadorA] = leia.nextLine();
			} 
			contadorA++;
		}
		return nome;
	}
	public static int[] cadastroIdadeDeletado(int[] idade, int contadorA){
		Scanner leia = new Scanner(System.in);
		int contador2 = contadorA + 1;
		while((contadorA < contador2) && (contador2 <= idade.length))  {
			if (idade[contadorA] == -1){
				System.out.print("Digite sua idade: ");
				idade[contadorA] = leia.nextInt();
			} 
			System.out.println();
			contadorA++;
		}
		return idade;
	}
	
	
	public static String[] edit (String[] nome, int[] idade, int idadeAuxiliar) {
		int opcao;
		Scanner leia = new Scanner(System.in);
		System.out.println();
		System.out.println("------------------------");
		System.out.println("[1]" + nome[0]);
		System.out.println("[2]" + nome[1]);
		System.out.println("[3]" + nome[2]);
		System.out.println("[4]" + nome[3]);
		System.out.println("[5]" + nome[4]);
		System.out.println("------------------------");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Nome: ");
			nome[0] = leia.next();
			idade[0] = editIdade(idadeAuxiliar);
		break;
		case 2:
			System.out.println("Nome: ");
			nome[1] = leia.next();
			idade[1] = editIdade(idadeAuxiliar);
		break;
		case 3:
			System.out.println("Nome: ");
			nome[2] = leia.next();
			idade[2] = editIdade(idadeAuxiliar);
		break;
		case 4:
			System.out.println("Nome: ");
			nome[3] = leia.next();
			idade[3] = editIdade(idadeAuxiliar);
		break;
		case 5:
			System.out.println("Nome: ");
			nome[4] = leia.next();
			idade[4] = editIdade(idadeAuxiliar);
		break;
		}
		return nome;
		
	}
	public static int editIdade (int idadeAuxiliar) {
		Scanner leia = new Scanner(System.in); 

		System.out.println("Digite sua idade: ");
		idadeAuxiliar = leia.nextInt(); 
			return idadeAuxiliar;
	}
	
	public static String[] delete (String[] nome) {
		int opcao;
		Scanner leia = new Scanner(System.in);
		System.out.println("------------------------");
		
		for(int contador = 0; contador < nome.length; contador++) {
			if((nome[contador] != "") && (nome[contador] != null)) {
				System.out.println("[" + (contador + 1) + "]" +nome[contador]);
			}
		}
		System.out.println("------------------------");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			nome[0] = null;
		break;
		case 2:
			nome[1] = null;
		break;
		case 3:
			nome[2] = null;
		break;
		case 4:
			nome[3] = null;
		break;
		case 5:
			nome[4] = null;
		break;
		}
		return nome;
	}
	public static int[] deleteIdade (int[] idade, String[] nome) {
		int opcao;
		Scanner leia = new Scanner(System.in);
		for(int contador = 0; contador < idade.length; contador++) {
			if(nome[contador] == null) {
				idade[contador] = -1;
			}
		}
		System.out.println("---------");
		System.out.println("Deletado");
		System.out.println("---------");
		return idade;
	}
	
	public static void listar(String[] nome, int[] idade) {
		if (((((nome[0] != "" ) || (nome[1] != "" ) || (nome[2] != "" ) || (nome[3] != "" ) || (nome[4] != "" ))))) {
		System.out.println("-----------------------------");
		} else if (((((nome[0] == "" ) && (nome[1] == "" ) && (nome[2] == "" ) && (nome[3] == "" ) && (nome[4] == "" ))))) {
			System.out.println("-------------------------------------");
			System.out.println("Nenhum individuo foi cadastrado ainda");
			System.out.println("-------------------------------------");
		}
		for(int contador = 0; contador < nome.length; contador++) {
			if((nome[contador] != "") && (nome[contador] != null)) {
				System.out.println("Nome: " + nome[contador]);
				System.out.println("Idade: " + idade[contador]);
				System.out.println("-----------------------------");
			}
		}
	}
}