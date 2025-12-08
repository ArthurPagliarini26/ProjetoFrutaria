package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.model.*;


public class Prateleira {
	
	List<Fruta> listaFruta;
    List<Verdura> listaVerdura;
    List<Produto> listaProduto;
	
	
	public Prateleira() {
		
		listaFruta = new ArrayList<>();
		listaVerdura = new ArrayList<>();
		listaProduto = new ArrayList<>();
		
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
			case 1 -> {
				String nome = atendente.frutaNome();
				double preco = atendente.frutaPreco();
				int quantidade = atendente.frutaQuantidade();
				double peso = atendente.frutaPeso();

				Produto fruta = new Fruta(nome, preco, quantidade, peso);
				listaProduto.add(fruta);
			}
			
			case 2 -> {
					
				String nome = atendente.verduraNome();
				double preco = atendente.verduraPreco();
				int quantidade = atendente.verduraQuantidade();
				String tipo = atendente.verduraTipo();
				
				Produto verdura = new Verdura(nome, preco, quantidade, tipo);
				listaProduto.add(verdura);
				
			}
			
			case 3 -> {
				
				String nome = atendente.produtoLimpezaNome();
				double preco = atendente.produtoLimpezaPreco();
				int quantidade = atendente.produtoLimpezaQuantidade();
				String marca = atendente.produtoLimpezaMarca();
				
				Produto produtoDeLimpeza = new ProdutoDeLimpeza(nome, preco, quantidade, marca);
				listaProduto.add(produtoDeLimpeza);
				
			}
			
			case 4 -> {
				
				  if(listaProduto.isEmpty()) {
						
						atendente.listaVazia();
						
					} else {
				
				for(Produto produto : listaProduto) {
					
					
					if(produto instanceof Fruta fruta) {
						atendente.visualizarFruta(fruta);
						
					}
				}
			  }
			}
			
	        case 5 -> {
	        	
               if(listaProduto.isEmpty()) {
					
					atendente.listaVazia();
					
				} else {
				
				for(Produto produto : listaProduto) {
					
					if(produto instanceof Verdura verdura) {
						atendente.visualizarVerdura(verdura);
						
					}
				}
				}
			}
	        
	        case 6 -> {
	        	
               if(listaProduto.isEmpty()) {
					
					atendente.listaVazia();
					
				} else {
	        	
	        	for(Produto produto : listaProduto) {
	        		
	        		if(produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
	        			atendente.visualizarProdutoLimpeza(produtoDeLimpeza);
	        		}
	        	}
				}
	        }
			
			
			case 7 -> {
				
             if(listaProduto.isEmpty()) {
					
					atendente.listaVazia();
					
				} else {
				
				String nome = atendente.pesquisarFruta();
				int decisao = 1;
				
				for(Produto fruta : listaProduto) {
					if(fruta instanceof Fruta && fruta.getNome().equalsIgnoreCase(nome)) {
						atendente.frutaEncontrada(nome);
						System.out.println("\n===INFORMAÇÕES DA FRUTA===\n");
						atendente.visualizarFruta((Fruta) fruta);
						decisao = 0;
						break;
					}
				   
				}
				
				if(decisao == 1) {
					
					atendente.frutaNaoEncontrada();
					
			     	}
				}
				
				
			}
			
			case 8 -> {
				
             if(listaProduto.isEmpty()) {
					
					atendente.listaVazia();
					
				} else {
				
				String nome = atendente.pesquisarVerdura();
				int decisao = 1;
				
				for(Produto verdura : listaProduto) {
					if(verdura instanceof Verdura && verdura.getNome().equalsIgnoreCase(nome)) {
						atendente.verduraEncontrada(nome);
						System.out.println("\n===INFORMAÇÕES DA VERDURA===\n");
						atendente.visualizarVerdura((Verdura) verdura);
						decisao = 0;
						break;
					}
				}
				
				if(decisao == 1) {
					
					atendente.verduraNaoEncontrada();
					
				}
				}
				
			}
			
			case 9 -> {
              if(listaProduto.isEmpty()) {
					
					atendente.listaVazia();
					
				} else {
					
				}
				String nome = atendente.pesquisarProdutoLimpeza();
				int decisao = 1;
				
				for(Produto produtoDeLimpeza : listaProduto) {
					if(produtoDeLimpeza instanceof ProdutoDeLimpeza && produtoDeLimpeza.getNome().equalsIgnoreCase(nome)) {
						atendente.produtoLimpezaEncontrado(nome);
						System.out.println("\n===INFORMAÇÕES DO PRODUTO DE LIMPEZA===\n");
						atendente.visualizarProdutoLimpeza((ProdutoDeLimpeza) produtoDeLimpeza);
						decisao = 0;
						break;
						
					}
				}
				
				if(decisao == 1) {
					atendente.produtoLimpezaNaoEncontrado();
				}
			
			}
			
			
			case 10 -> {
				
               if(listaProduto.isEmpty()) {
					
					atendente.listaVazia();
					
				} else {
				
				String nome = atendente.removerFruta();
				int decisao = 1;
				
				for(Produto fruta : listaProduto) {
					if(fruta.getNome().equalsIgnoreCase(nome)) {
						atendente.frutaRemovida(nome);
						listaProduto.remove(fruta);
						decisao = 0;
						break;
					}
				}
				
				if(decisao == 1) {
					
					atendente.frutaNaoEncontrada();
					
				}
				}
				
			}
			
             case 11 -> {
            	 
            	 if(listaProduto.isEmpty()) {
 					
 					atendente.listaVazia();
 					
 				} else {
				
				String nome = atendente.removerVerdura();
				int decisao = 1;
				
				for(Produto verdura : listaProduto) {
					if(verdura.getNome().equalsIgnoreCase(nome)) {
						atendente.verduraRemovida(nome);
						listaProduto.remove(verdura);
						decisao = 0;
						break;
					}
				}
				
                 if(decisao == 1) {
					
					atendente.verduraNaoEncontrada();
					
				}
 				}
				
			}
             
             case 12 -> {
            	 
            	 if(listaProduto.isEmpty()) {
 					
 					atendente.listaVazia();
 					
 				} else {
            	 
            	 String nome = atendente.removerProdutoLimpeza();
            	 int decisao = 1;
            	 
            	 for(Produto produtoDeLimpeza : listaProduto) {
            		 if(produtoDeLimpeza.getNome().equalsIgnoreCase(nome)) {
            			 atendente.produtoLimpezaRemovido(nome);
            			 listaProduto.remove(produtoDeLimpeza);
            			 decisao = 0;
            			 break;
            		 }
            	 }
            	 
            	 if(decisao == 1) {
            		 atendente.produtoLimpezaNaoEncontrado();
            	 }
 			}
            	 
            	 
             }
			
             case 13 -> {
            	 
            	
            	 int total = 0;
            	 
            	 for(Produto fruta : listaProduto) {
            		 if(fruta instanceof Fruta) {
            		 total += fruta.getQuantidade();
            		 }
            	 }
            	 
        
            		 
            		 atendente.mostrarQuantidadeFruta(total);
            	 }
            	 
             
             
               case 14 -> {
            	 
            
            	 int total = 0;

            	 for(Produto verdura : listaProduto) {
            		 if(verdura instanceof Verdura) {
            		 total += verdura.getQuantidade();
            		 
            		 }
            	 }
            	 
            		 atendente.mostrarQuantidadeVerdura(total);
            	 }
               
               case 15 -> {
            	   
            	   int total = 0;
            	   
            	   for(Produto produtoDeLimpeza : listaProduto) {
            		   if(produtoDeLimpeza instanceof ProdutoDeLimpeza) {
            			   total += produtoDeLimpeza.getQuantidade();
            			   
            		   }
            	   }
            	   
            	   atendente.mostrarQuantidadeProdutoLimpeza(total);
               }
            	 
             }

}
	
}