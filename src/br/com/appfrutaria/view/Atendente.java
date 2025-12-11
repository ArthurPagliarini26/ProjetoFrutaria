package br.com.appfrutaria.view;

import java.util.Scanner;
import br.com.appfrutaria.model.*;

public class Atendente {		
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}
	
	int opcao;

	public int menuPrincipal() {
		
		while (true) { 
		
		System.out.println("╔══════════════════════════════════════╗");
		System.out.println("║           MENU PRINCIPAL             ║");
		System.out.println("╠══════════════════════════════════════╣");
		System.out.println("║ 1. Cadastrar Produto                 ║");
		System.out.println("║ 2. Listar Produto                    ║");
		System.out.println("║ 3. Pesquisar Produto                 ║");
		System.out.println("║ 4. Remover Produto                   ║");
		System.out.println("║ 5. Mostrar Quantidade Produto        ║");
		System.out.println("║ 6. Editar Produto                    ║");
		System.out.println("║ 0. Sair                              ║");
		System.out.println("╚══════════════════════════════════════╝");
		System.out.print("Digite sua escolha: ");
	
		
		
		if(!input.hasNextInt()) {
			System.out.println("Entrada inválida, digite apenas números.");
			input.nextLine();
			continue;
			
		}
		
		opcao = input.nextInt();
		input.nextLine();
		
		if(opcao < 0 || opcao > 15) {
			System.out.println("Opção inválida, digite um número apresentado nas opções.");
			continue;
			
		}
		
		return opcao;
		}
		
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
		System.out.print("Digite o peso da fruta: ");
		return input.nextDouble();

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
	
	  public String editarFruta() {
	    	System.out.print("Digite o nome da fruta para editar: ");
	    	return input.nextLine();
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
    
    public String editarVerdura() {
    	System.out.print("Digite o nome da verdura para editar: ");
    	return input.nextLine();
    }
	
	
	//PRODUTO DE LIMPEZA

		public String produtoLimpezaNome() {
			System.out.print("Digite o nome do produto de limpeza: ");
			return input.nextLine();
		}

		public double produtoLimpezaPreco() {
			System.out.print("Digite o preço do produto de limpeza: ");
			return input.nextDouble();
		}

		public int produtoLimpezaQuantidade() {
			System.out.print("Digite a quantidade do produto de limpeza: ");
			return input.nextInt();
		}

		public String produtoLimpezaMarca() {
			input.nextLine();
			System.out.print("Digite a marca do produto de limpeza: ");
			return input.nextLine();

		}
		
		
		public String removerProdutoLimpeza() {
			System.out.print("Digite o nome do produto de limpeza a remover: ");
			return input.nextLine();
		}

		public void produtoLimpezaRemovido(String nome) {
			System.out.println("O produto de limpeza " + nome + " foi removido.");
		}
		
		public String pesquisarProdutoLimpeza() {
			
			System.out.print("Digite o produto de limpeza para pesquisar: ");
			return input.nextLine();
		}
		
		
		public void mostrarQuantidadeProdutoLimpeza(int total) {
			
			System.out.println("O total de produto de limpeza comprados foi: " + total);
			
		}
		
		public void produtoLimpezaEncontrado(String nome) {
			
			System.out.println("O produto de limpeza " + nome + " foi encontrado");
			
		}

		public void produtoLimpezaNaoEncontrado() {
			System.out.println("produto de limpeza não encontrado.");
		}

	    public void finalizarApp() {
		System.out.println("Encerrando sistema...");
	}
	    
	    public void listaFrutaVazia() {
	    	System.out.println("A lista de frutas ainda está vazia");
	    }
	    
	    public void listaVerduraVazia() {
	    	System.out.println("A lista de verduras ainda está vazia");
	    }
	    
	    public void listaProdutoLimpezaVazia() {
	    	System.out.println("A lista de produtos de limpeza ainda está vazia");
	    }
	    
	    public String editarProdutoLimpeza() {
	    	System.out.print("Digite o nome do produto de limpeza para editar: ");
	    	return input.nextLine();
	    }
	    
	    //TUDO
	    
	    public void visualizarTudo(Produto produto) {
	    	System.out.println(produto);
	    	
	    }
	    
	    public void listaTotalVazia() {
	    	System.out.println("A lista ainda está totalmente vazia");
	    	
	    }
	    
	    public void visualizarProduto(Produto produto) {
			
	    	System.out.println("--------------------------");
			System.out.println("=== " + produto.getNome() + " ===");
			System.out.println(produto);
			
			
		}
	    
	    public String editarNome() {
	        System.out.print("Novo nome: ");
	        return input.nextLine();
	    }

	    public double editarPreco() {
	        System.out.print("Novo preço: ");
	        return input.nextDouble();
	    }

	    public int editarQuantidade() {
	        System.out.print("Nova quantidade: ");
	        return input.nextInt();
	    }
	    
	    public double editarPeso() {
	        System.out.print("Novo peso: ");
	        return input.nextDouble();
	    }
	    
	    public String editarTipo() {
	        System.out.print("Novo tipo: ");
	        input.nextLine();
	        return input.nextLine();
	        
	    }
	    
	    public String editarMarca() {
	        System.out.print("Nova marca: ");
	        return input.nextLine();
	    }
	    
	    
	    public void mensagemAtualizaddo(String nome) {
	    	System.out.println(nome + " atualizado(a) com sucesso!");
	    }




	    
	    
	    
	    //SUBMENUS
	    
	    int opcaoCadastrar;
	    
	    public int subMenuCadastrar() {
	    	
	    	while(true) {
	    	System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║              CADASTRAR               ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║ 1. Cadastrar Fruta                   ║");
			System.out.println("║ 2. Cadastrar Verdura                 ║");
			System.out.println("║ 3. Cadastrar Produto de Limpeza      ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.print("Digite sua escolha: ");
			
			if(!input.hasNextInt()) {
				System.out.println("Entrada inválida, digite apenas números.");
				input.nextLine();
				continue;
				
			}
			
			opcaoCadastrar = input.nextInt();
			input.nextLine();
			
			
			
			if(opcaoCadastrar < 0 || opcaoCadastrar > 3) {
				System.out.println("Opção inválida, digite um número apresentado nas opções.");
				continue;
			}
			
			return opcaoCadastrar;
	    	}
	    	
		
	    	
	    }
	    
	    int opcaoListar;
	    
	   
	    public int subMenuListar() {
	    	
	    	while(true) {
	    		 
	    	System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║               LISTAR                 ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║ 1. Listar Fruta                      ║");
			System.out.println("║ 2. Listar Verdura                    ║");
			System.out.println("║ 3. Listar Produto de Limpeza         ║");
			System.out.println("║ 4. Listar Tudo                       ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.print("Digite sua escolha: ");
			
			if(!input.hasNextInt()) {
				System.out.println("Entrada inválida, digite apenas números.");
				input.nextLine();
				continue;

			}
			
			opcaoListar = input.nextInt();
			input.nextLine();
			
			
			if(opcaoListar < 1 || opcaoListar > 4) {
				System.out.println("Opção inválida, digite um número apresentado nas opções.");
				continue;
				
			}
	    	
	       return opcaoListar;
	      }
	    }
	    
	    int opcaoPesquisar;
	    
	    public int subMenuPesquisar() {
	    	
	    	while (true) {
	    	
	    	System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║               PESQUISAR              ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║ 1. Pesquisar Fruta                   ║");
			System.out.println("║ 2. Pesquisar Verdura                 ║");
			System.out.println("║ 3. Pesquisar Produto de Limpeza      ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.print("Digite sua escolha: ");
			
			if(!input.hasNextInt()) {
				System.out.println("Entrada inválida, digite apenas números.");
				input.nextLine();
				continue;

			}
			
			opcaoPesquisar = input.nextInt();
			input.nextLine();
			
			
			if(opcaoPesquisar < 1 || opcaoPesquisar > 3) {
				System.out.println("Opção inválida, digite um número apresentado nas opções.");
				continue;
				
			}
	    	
	       return opcaoPesquisar;
	       
	      }
	    }
	    
        int opcaoRemover;
	    
	    public int subMenuRemover() {
	    	
	    	while (true) {
	    	
	    	System.out.println("╔══════════════════════════════════════╗");
			System.out.println("║               REMOVER                ║");
			System.out.println("╠══════════════════════════════════════╣");
			System.out.println("║ 1. Remover Fruta                     ║");
			System.out.println("║ 2. Remover Verdura                   ║");
			System.out.println("║ 3. Remover Produto de Limpeza        ║");
			System.out.println("╚══════════════════════════════════════╝");
			System.out.print("Digite sua escolha: ");
			
			if(!input.hasNextInt()) {
				System.out.println("Entrada inválida, digite apenas números.");
				input.nextLine();
				continue;

			}
			
			opcaoRemover = input.nextInt();
			input.nextLine();
			
			
			if(opcaoRemover < 1 || opcaoRemover > 3) {
				System.out.println("Opção inválida, digite um número apresentado nas opções.");
				continue;
				
			}
	    	
	       return opcaoRemover;
	       
	      }
	    }
	    
	    int opcaoMostrarQuantidade;
	    
	    public int subMenuQuantidade() {
	    	
	    	while (true) {
	    	System.out.println("╔══════════════════════════════════════════╗");
			System.out.println("║            MOSTRAR QUANTIDADE            ║");
			System.out.println("╠══════════════════════════════════════════╣");
			System.out.println("║ 1. Mostrar Quantidade Fruta              ║");
			System.out.println("║ 2. Mostrar Quantidade Verdura            ║");
			System.out.println("║ 3. Mostrar Quantidade Produto de Limpeza ║");
			System.out.println("╚══════════════════════════════════════════╝");
			System.out.print("Digite sua escolha: ");
			
			if(!input.hasNextInt()) {
				System.out.println("Entrada inválida, digite apenas números.");
				input.nextLine();
				continue;
				
			}
			
				opcaoMostrarQuantidade = input.nextInt();
				input.nextLine();
				
				if(opcaoMostrarQuantidade < 1 && opcaoMostrarQuantidade > 3) {
					System.out.println("Opção inválida, digite um número apresentado nas opções.");
					continue;
					
				}
				return opcaoMostrarQuantidade;
				

	    	}
	    }
	    
	    int opcaoEditar;

	    public int subMenuEditar() {
	        while (true) {
	            System.out.println("╔══════════════════════════════════════╗");
	            System.out.println("║                EDITAR                ║");
	            System.out.println("╠══════════════════════════════════════╣");
	            System.out.println("║ 1. Editar Fruta                      ║");
	            System.out.println("║ 2. Editar Verdura                    ║");
	            System.out.println("║ 3. Editar Produto de Limpeza         ║");
	            System.out.println("╚══════════════════════════════════════╝");
	            System.out.print("Digite sua escolha: ");

	            if(!input.hasNextInt()) {
	                System.out.println("Entrada inválida, digite um número.");
	                input.nextLine();
	                continue;
	            }

	            opcaoEditar = input.nextInt();
	            input.nextLine();

	            if(opcaoEditar < 1 || opcaoEditar > 3) {
	                System.out.println("Opção inválida.");
	                continue;
	            }

	            return opcaoEditar;
	        }
	    }

	    
	    
}