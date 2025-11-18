package br.com.appfrutaria;

import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.service.Prateleira;

public class AppFrutaria {

	public static void main(String[] args) {
		
		Atendente atendente = new Atendente();
		Prateleira estoque = new Prateleira();
		int opcaoMenuEscolhida = 1;

		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
		} while (opcaoMenuEscolhida != 4);

		atendente.finalizarApp();
	}
}