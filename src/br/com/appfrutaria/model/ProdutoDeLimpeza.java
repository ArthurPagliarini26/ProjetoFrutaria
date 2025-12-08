package br.com.appfrutaria.model;

public class ProdutoDeLimpeza extends Produto {
	
	private String marca;
	
	
	public ProdutoDeLimpeza() {
		super();
		this.marca = "";
	}
	
	public ProdutoDeLimpeza(String nome, double preco, int quantidade, String marca) {
		super(nome, preco, quantidade);
		this.marca = marca;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
    public String toString() {
    	return super.toString() +
    			"Marca: " + marca;
    }
	
	

}
