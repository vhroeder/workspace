package br.com.ecommerce.beans;

public class Produto {
	private int id;
	private String descricao;
	private int qtde;
	private float valorCompra;
	private float valorVenda;
	
	public Produto(int id, String descricao, int qtde, float valorCompra, float valorVenda) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	
	public Produto() {
		super();
	}


	// get all e set all
	public String getAll() {
		return
				"ID do Produto: " + this.id + "\n" +
				"Descri��o: " + this.descricao + "\n" +
				"Quantidade: " + this.qtde + "\n" +
				"Valor de Compra: " + this.valorCompra + "\n" +
				"Valor de Venda: " + this.valorVenda + "\n";
	}
	public void setAll(int id, String descricao, int qtde, float valorCompra) {
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorCompra = valorCompra;
		this.valorVenda = (float)1.1 * this.valorCompra;
	}
	//gets e sets individuais
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
}
