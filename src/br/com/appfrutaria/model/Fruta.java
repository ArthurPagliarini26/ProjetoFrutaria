package br.com.appfrutaria.model;

public class Fruta {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private String nome;
	private double preco;
	private int quantidade;
	private String tipo;
	private int codigo;
	private static int codigoAdicionar = 1;

	public Fruta() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
		this.tipo = "";
		this.codigo = codigoAdicionar++;
	}

	public Fruta(String nome, double preco, int quantidade, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.codigo = codigoAdicionar++;
	}

}