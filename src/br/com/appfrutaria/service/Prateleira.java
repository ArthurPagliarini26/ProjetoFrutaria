package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.model.Fruta;
import br.com.appfrutaria.model.Verdura;

public class Prateleira {
	
	List<Fruta> listaFruta;
    List<Verdura> listaVerdura;
	
	
	public Prateleira() {
		
		listaFruta = new ArrayList<>();
		listaVerdura = new ArrayList<>();
		
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
			case 1 -> {
				String nome = atendente.frutaNome();
				double preco = atendente.frutaPreco();
				int quantidade = atendente.frutaQuantidade();
				double peso = atendente.frutaPeso();

				Fruta fruta = new Fruta(nome, preco, quantidade, peso);
				listaFruta.add(fruta);
			}
			
			case 2 -> {
				
				String nome = atendente.verduraNome();
				double preco = atendente.verduraPreco();
				int quantidade = atendente.verduraQuantidade();
				String tipo = atendente.verduraTipo();
				
				Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
				listaVerdura.add(verdura);
				
			}
			
			case 3 -> {
				
				for(Fruta fruta : listaFruta) {
					atendente.visualizarFruta(fruta);
				}
				
			}
			
			case 4 -> {
				
				for(Verdura verdura : listaVerdura) {
					atendente.visualizarVerdura(verdura);
				}
				
			}
			
			case 5 -> {
				
				String nome = atendente.pesquisarFruta();
				int decisao = 1;
				
				for(Fruta fruta : listaFruta) {
					if(fruta.getNome().equalsIgnoreCase(nome)) {
						atendente.frutaEncontrada(nome);
						System.out.println("\n===INFORMAÇÕES DA FRUTA===\n");
						atendente.visualizarFruta(fruta);
						decisao = 0;
						break;
					}
				}
				
				if(decisao == 1) {
					
					atendente.frutaNaoEncontrada();
					
				}
				
				
			}
			
			case 6 -> {
				
				String nome = atendente.pesquisarVerdura();
				int decisao = 1;
				
				for(Verdura verdura : listaVerdura) {
					if(verdura.getNome().equalsIgnoreCase(nome)) {
						atendente.verduraEncontrada(nome);
						System.out.println("\n===INFORMAÇÕES DA VERDURA===\n");
						atendente.visualizarVerdura(verdura);
						decisao = 0;
						break;
					}
				}
				
				if(decisao == 1) {
					
					atendente.verduraNaoEncontrada();
					
				}
				
			}
			
			case 7 -> {
				
				String nome = atendente.removerFruta();
				int decisao = 1;
				
				for(Fruta fruta : listaFruta) {
					if(fruta.getNome().equalsIgnoreCase(nome)) {
						atendente.frutaRemovida(nome);
						listaFruta.remove(fruta);
						decisao = 0;
						break;
					}
				}
				
				if(decisao == 1) {
					
					atendente.frutaNaoEncontrada();
					
				}
				
			}
			
             case 8 -> {
				
				String nome = atendente.removerVerdura();
				int decisao = 1;
				
				for(Verdura verdura : listaVerdura) {
					if(verdura.getNome().equalsIgnoreCase(nome)) {
						atendente.verduraRemovida(nome);
						listaVerdura.remove(verdura);
						decisao = 0;
						break;
					}
				}
				
                 if(decisao == 1) {
					
					atendente.verduraNaoEncontrada();
					
				}
				
			}
			
             case 9 -> {
            	 
            	
            	 int total = 0;
            	 int decisao = 1;
            	 
            	 for(Fruta fruta : listaFruta) {
            		 total += fruta.getQuantidade();
            			 decisao = 0;
            			 break;
 
            	 }
            	 
        
            		 
            		 atendente.mostrarQuantidadeFruta(total);
            	 }
            	 
             
             
               case 10 -> {
            	 
            
            	 int total = 0;
            
            	 
            	 for(Verdura verdura : listaVerdura) {
            		 total += verdura.getQuantidade();

            		 }

           
            		 atendente.mostrarQuantidadeVerdura(total);
            	 }
            	 
             }

		}
	
}