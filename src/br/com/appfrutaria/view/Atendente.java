package br.com.appfrutaria.view;

import java.util.Scanner;
import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;

public class Atendente {		
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║           MENU PRINCIPAL             ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║ 1. Cadastrar fruta                   ║");
		System.out.println("║ 2. Cadastrar Verdura                 ║");
		System.out.println("║ 3. Listar Fruta                      ║");
		System.out.println("║ 4. Listar Verdura                    ║");
		System.out.println("║ 5. Pesquisar Fruta                   ║");
		System.out.println("║ 6. Pesquisar Verdura                 ║");
		System.out.println("║ 7. Remover Fruta                     ║");
		System.out.println("║ 8. Remover Verdura                   ║");
		System.out.println("║ 9. Mostrar quantidade Verdura        ║");
		System.out.println("║ 10. Mostrar quantidade Fruta         ║");
		System.out.println("║ 0. Sair                              ║");
		System.out.println("╚══════════════════════════════════════╝");
		System.out.print("Digite sua escolha: ");
		int opcao = input.nextInt();
		input.nextLine();
		return opcao;
		
	}
	
	//FRUTA

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

	public double frutaPeso() {
		input.nextLine();
		System.out.print("Te amo pedro, mas quanto? ");
		return input.nextDouble();

	}
	
	public void visualizarFruta(Fruta fruta) {
		System.out.println("-------------------");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Tipo: " + fruta.getPeso());
		
	}
	
	public String removerFruta() {
		System.out.print("Digite o nome da fruta a remover: ");
		return input.nextLine();
	}

	public void frutaRemovida(String nome) {
		System.out.println("A fruta " + nome + " foi removida.");
	}
	
	public String pesquisarFruta() {
		
		System.out.print("Digite a fruta para pesquisar: ");
		return input.nextLine();
	}
	
	public String perguntarQuantidadeFruta() {
		
		System.out.print("Digite a fruta para mostrar a quantidade: ");
		return input.nextLine();
		
	}
	
	public void mostrarQuantidadeFruta(int total) {
		
		System.out.println("O total de frutas compradas foi: " + total);
		
	}
	
	public void frutaEncontrada(String nome) {
		
		System.out.println("A fruta " + nome + " foi encontrada");
		
	}

	public void frutaNaoEncontrada() {
		System.out.println("Fruta não encontrada.");
	}
	
	
	//VERDURA
	
	public String verduraNome() {
		System.out.print("Digite o nome da verdura: ");
		return input.nextLine();
	}

	public double verduraPreco() {
		System.out.print("Digite o preço da verdura: ");
		return input.nextDouble();
	}

	public int verduraQuantidade() {
		System.out.print("Digite a quantidade da verdura: ");
		return input.nextInt();
	}

	public String verduraTipo() {
		input.nextLine();
		System.out.print("Digite o tipo da verdura: ");
		return input.nextLine();

	}
	
	public String removerVerdura() {
		System.out.print("Digite o nome da verdura a remover: ");
		return input.nextLine();
	}

	public void verduraRemovida(String nome) {
		System.out.println("A verdura " + nome + " foi removida.");
	}

	public void verduraNaoEncontrada() {
		System.out.println("Verdura não encontrada.");
	}
	
    public String pesquisarVerdura() {
		
		System.out.print("Digite a verdura para pesquisar: ");
		return input.nextLine();
	}
    
    public void verduraEncontrada(String nome) {
		
		System.out.println("A verdura " + nome + " foi encontrada");
		
	}

	
	public String perguntarQuantidadeVerdura() {
		
		System.out.print("Digite a verdura para mostrar a quantidade: ");
		return input.nextLine();
		
	}
	
    public void mostrarQuantidadeVerdura(int total) {
		
		System.out.println("O total de verduras compradas foi: " + total);
		
	}
	
	public void visualizarVerdura(Verdura verdura) {
		
		System.out.println("-------------------");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preço: R$" + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
		
		
	}

	public void finalizarApp() {
		System.out.println("Encerrando sistema...");
	}
}