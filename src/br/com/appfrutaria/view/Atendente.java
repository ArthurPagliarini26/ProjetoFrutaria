package br.com.appfrutaria.view;

import java.util.Scanner;
import br.com.appfrutaria.model.Fruta;

public class Atendente {
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║           MENU PRINCIPAL             ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║ 1. Cadastrar Produto                 ║");
		System.out.println("║ 2. Listar Produtos                   ║");
		System.out.println("║ 3. Remover Produto                   ║");
		System.out.println("║ 4. Sair                              ║");
		System.out.println("╚══════════════════════════════════════╝");
		System.out.print("Digite sua escolha: ");
		int opcao = input.nextInt();
		input.nextLine();
		return opcao;
	}

	public String frutaNome() {
		System.out.print("Digite o nome da fruta: ");
		return input.nextLine();
	}

	public double frutaPreco() {
		System.out.print("Digite o preço da fruta: ");
		return input.nextDouble();
	}

	public int frutaQuantidade() {
		System.out.print("Digite a quantidade: ");
		return input.nextInt();
	}

	public String frutaTipo() {
		input.nextLine(); // limpa quebra de linha
		System.out.print("Digite o tipo da fruta: ");
		return input.nextLine();

	}


	public void vizualizar(Fruta fruta) {
		System.out.println("-------------------");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Tipo: " + fruta.getTipo());
		System.out.println("Código: " + fruta.getCodigo());
	}

	public String removerFruta() {
		System.out.print("Digite o nome da fruta a remover: ");
		return input.nextLine();
	}

	public void vizualizarFrutaRemovidada(String nome) {
		System.out.println("A fruta " + nome + " foi removida.");
	}

	public void mensagemNaoEncontrado() {
		System.out.println("Fruta não encontrada.");
	}

	public void finalizarApp() {
		System.out.println("Encerrando sistema...");
	}
}