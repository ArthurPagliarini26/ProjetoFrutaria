package br.com.appfrutaria.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appfrutaria.view.Atendente;
import br.com.appfrutaria.model.*;


public class Prateleira {
	
    List<Produto> listaProduto;
	
	public Prateleira() {

		listaProduto = new ArrayList<>();
		
	}
	
	private boolean haAlgumaFruta() {
	    for (Produto p : listaProduto) {
	        if (p instanceof Fruta) 
	        	return true;
	    }
	    return false;
	}

	private boolean haAlgumaVerdura() {
	    for (Produto p : listaProduto) {
	        if (p instanceof Verdura) 
	        	return true;
	    }
	    return false;
	}

	private boolean haAlgumProdutoLimpeza() {
	    for (Produto p : listaProduto) {
	        if (p instanceof ProdutoDeLimpeza) 
	        	return true;
	    }
	    return false;
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
			case 1 -> {
				
				int opcaoCadastrar = atendente.subMenuCadastrar();
				
				if(opcaoCadastrar == 1) {
					
				
				String nome = atendente.frutaNome();
				double preco = atendente.frutaPreco();
				int quantidade = atendente.frutaQuantidade();
				double peso = atendente.frutaPeso();

				Produto fruta = new Fruta(nome, preco, quantidade, peso);
				listaProduto.add(fruta);
				
				} else if(opcaoCadastrar == 2) {
					
					String nome = atendente.verduraNome();
					double preco = atendente.verduraPreco();
					int quantidade = atendente.verduraQuantidade();
					String tipo = atendente.verduraTipo();
					
					Produto verdura = new Verdura(nome, preco, quantidade, tipo);
					listaProduto.add(verdura);
					
				} else if(opcaoCadastrar == 3) {
					
					String nome = atendente.produtoLimpezaNome();
					double preco = atendente.produtoLimpezaPreco();
					int quantidade = atendente.produtoLimpezaQuantidade();
					String marca = atendente.produtoLimpezaMarca();
					
					Produto produtoDeLimpeza = new ProdutoDeLimpeza(nome, preco, quantidade, marca);
					listaProduto.add(produtoDeLimpeza);
				}
			}
			
			
			case 2 -> {
				
				int opcaoListar = atendente.subMenuListar();
				
				
				if(opcaoListar == 1) {
					
				
				if (!haAlgumaFruta()) {
				    atendente.listaFrutaVazia();
				    
				} else {
						
					
				for(Produto produto : listaProduto) {
					
					
					if(produto instanceof Fruta fruta) {
						atendente.visualizarProduto(fruta);
						
					}
				}
			  }
				
			} else if(opcaoListar == 2) {
				
				if (!haAlgumaVerdura()) {
	        	    atendente.listaVerduraVazia();
	        	} else {
				
				for(Produto produto : listaProduto) {
					
					if(produto instanceof Verdura verdura) {
						atendente.visualizarProduto(verdura);
						
					}
				}
				}
				
			} else if(opcaoListar == 3) {
				if (!haAlgumProdutoLimpeza()) {
	        	    atendente.listaProdutoLimpezaVazia();
	        	    
	        	} else {
	        	
	        	for(Produto produto : listaProduto) {
	        		
	        		if(produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
	        			atendente.visualizarProduto(produtoDeLimpeza);
	        		}
	        	}
				}
				
			} else if(opcaoListar == 4) {
				
				if(!haAlgumaFruta() && !haAlgumaVerdura() && !haAlgumProdutoLimpeza()) {
					atendente.listaTotalVazia();
					
				} else {
				
				for(Produto produto : listaProduto) {
					System.out.println("\n---" + produto.getNome() + "---");
					atendente.visualizarTudo(produto);
				}
				
				}
			}
		}
		
			case 3 -> {
				
				int opcaoPesquisar = atendente.subMenuPesquisar();
				
				if(opcaoPesquisar == 1) {
				
				if (!haAlgumaFruta()) {
				    atendente.listaFrutaVazia();
				} else {
				
				String nome = atendente.pesquisarFruta();
				int decisao = 1;
				
				for(Produto fruta : listaProduto) {
					if(fruta instanceof Fruta && fruta.getNome().equalsIgnoreCase(nome)) {
						atendente.frutaEncontrada(nome);
						System.out.println("\n===INFORMAÇÕES DA FRUTA===");
						atendente.visualizarProduto((Fruta) fruta);
						decisao = 0;
						break;
					}
				   
				}
				
				if(decisao == 1) {
					
					atendente.frutaNaoEncontrada();
					
			     	}
				}
				
			} else if(opcaoPesquisar == 2) {
				
				if (!haAlgumaVerdura()) {
				    atendente.listaVerduraVazia();
				} else {
				
				String nome = atendente.pesquisarVerdura();
				int decisao = 1;
				
				for(Produto verdura : listaProduto) {
					if(verdura instanceof Verdura && verdura.getNome().equalsIgnoreCase(nome)) {
						atendente.verduraEncontrada(nome);
						System.out.println("\n===INFORMAÇÕES DA VERDURA===");
						atendente.visualizarProduto((Verdura) verdura);
						decisao = 0;
						break;
					}
				}
				
				if(decisao == 1) {
					
					atendente.verduraNaoEncontrada();
					
				}
				}
			} else if(opcaoPesquisar == 3) {
				
			
				if (!haAlgumProdutoLimpeza()) {
				    atendente.listaProdutoLimpezaVazia();
				    break;
	    
				} else {
			
			
				String nome = atendente.pesquisarProdutoLimpeza();
				int decisao = 1;
				
				for(Produto produtoDeLimpeza : listaProduto) {
					if(produtoDeLimpeza instanceof ProdutoDeLimpeza && produtoDeLimpeza.getNome().equalsIgnoreCase(nome)) {
						atendente.produtoLimpezaEncontrado(nome);
						System.out.println("\n===INFORMAÇÕES DO PRODUTO DE LIMPEZA===");
						atendente.visualizarProduto((ProdutoDeLimpeza) produtoDeLimpeza);
						decisao = 0;
						break;
						
					}
				}
				
				
				if(decisao == 1) {
					atendente.produtoLimpezaNaoEncontrado();
					
				}
				
			}
			}
		}

			case 4 -> {
				
				int opcaoRemover = atendente.subMenuRemover();
				
				if(opcaoRemover == 1) {
					
				
				if (!haAlgumaFruta()) {
				    atendente.listaFrutaVazia();
				    break;
				    
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
				
			 } else if(opcaoRemover == 2) {
				 if (!haAlgumaVerdura()) {
         		    atendente.listaVerduraVazia();
         		    break;
         		    
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
				 
				 
			 } else if(opcaoRemover == 3) {
				 if (!haAlgumProdutoLimpeza()) {
         		    atendente.listaProdutoLimpezaVazia();
         		    break;
         		    
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
			}

             case 5 -> {
            	 
            	 int opcaoMostrarQuantidade = atendente.subMenuQuantidade();
            	 
            	 if(opcaoMostrarQuantidade == 1) {
            	 
            	 int total = 0;
            	 
            	 for(Produto fruta : listaProduto) {
            		 if(fruta instanceof Fruta) {
            		 total += fruta.getQuantidade();
            		 
            		 }
            	 }
            	 
            		 atendente.mostrarQuantidadeFruta(total);
            		 
            	 } else if(opcaoMostrarQuantidade == 2) {
            		 
            		 int total = 0;

                	 for(Produto verdura : listaProduto) {
                		 if(verdura instanceof Verdura) {
                		 total += verdura.getQuantidade();
                		 
                		 }
                	 }
                	 
                		 atendente.mostrarQuantidadeVerdura(total);
            		 
            	 } else if(opcaoMostrarQuantidade == 3) {
            		 
            		  int total = 0;
               	   
               	   for(Produto produtoDeLimpeza : listaProduto) {
               		   if(produtoDeLimpeza instanceof ProdutoDeLimpeza) {
               			   total += produtoDeLimpeza.getQuantidade();
               			   
               		   }
               	   }
               	   
               	   atendente.mostrarQuantidadeProdutoLimpeza(total);
               	   
                    } 
            	 }
             
             case 6 -> {
            	 
            	 int opcaoEditar = atendente.subMenuEditar();
            	 
            	 
            	 if(opcaoEditar == 1) {
            		 
            		 if (!haAlgumaFruta()) {
      				    atendente.listaFrutaVazia();
      				    break;
      				    
      				} else {
      					
            		 String nome = atendente.editarFruta();
            		 int decisao = 1;
            		 
     					for(Produto p : listaProduto) {
     						if(p instanceof Fruta fruta && p.getNome().equalsIgnoreCase(nome)) {
     							fruta.setNome(atendente.editarNome());
     	     					fruta.setPreco(atendente.editarPreco());
     	     					fruta.setQuantidade(atendente.editarQuantidade());
     	     					fruta.setPeso(atendente.editarPeso());
     	     					decisao = 0;
     	     					atendente.mensagemAtualizaddo(nome);
     	     					
     						}
     					}
     					
     					if(decisao != 0) {
     						atendente.frutaNaoEncontrada();
     						
     					}
     				}
            		 
            	 } else if(opcaoEditar == 2) {
            		 
            		 if (!haAlgumaVerdura()) {
      				    atendente.listaVerduraVazia();
      				    break;
      				    
      				} else {
      					
            		 String nome = atendente.editarVerdura();
            		 int decisao = 1;
            		 
     					
     					for(Produto p : listaProduto) {
     						if(p instanceof Verdura verdura && p.getNome().equalsIgnoreCase(nome)) {
     							verdura.setNome(atendente.editarNome());
     							verdura.setPreco(atendente.editarPreco());
     							verdura.setQuantidade(atendente.editarQuantidade());
     							verdura.setTipo(atendente.editarTipo());
     	     					decisao = 0;
     	     					atendente.mensagemAtualizaddo(nome);
     						}
     					}
     					
     					if(decisao != 0) {
     						atendente.verduraNaoEncontrada();
     						
     					}			
     				}
            		 
            		 
            	 } else if(opcaoEditar == 3) {
            		 
            		 if (!haAlgumProdutoLimpeza()) {
      				    atendente.listaProdutoLimpezaVazia();
      				    break;
      				    
      				} else {
      					
            		 String nome = atendente.editarProdutoLimpeza();
            		 int decisao = 1;
            		 
     					
     					for(Produto p : listaProduto) {
     						if(p instanceof ProdutoDeLimpeza produtoLimpeza && p.getNome().equalsIgnoreCase(nome)) {
     							produtoLimpeza.setNome(atendente.editarNome());
     							produtoLimpeza.setPreco(atendente.editarPreco());
     							produtoLimpeza.setQuantidade(atendente.editarQuantidade());
     							produtoLimpeza.setMarca(atendente.editarMarca());
     	     					decisao = 0;
     	     					atendente.mensagemAtualizaddo(nome);
     						}		
     					}
     					
     					if(decisao != 0) {
     						atendente.produtoLimpezaNaoEncontrado();
     					}			
     				} 
            	 }
               }
             } 
         }	
}