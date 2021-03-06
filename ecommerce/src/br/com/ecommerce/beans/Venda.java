package br.com.ecommerce.beans;

public class Venda {
	private int notaFiscal;
	private String data;
	private float total;
	private Produto produto;
	private Cliente cliente;
	public Venda() {
		super();
	}
	public Venda(int notaFiscal, String data, float total, Produto produto, Cliente cliente) {
		super();
		this.notaFiscal = notaFiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
	}
	// get all e set all
	public String getAll() {
		return
				"N� da Nota Fiscal: " + this.notaFiscal + "\n" +
				"Data da Venda: " + this.data + "\n" +
				"Valor total da venda: R$ " + this.total + "\n\n" +
				"Dados do Produto: \n" + this.produto.getAll() + "\n" +
				"Dados do Cliente: \n" + this.cliente.getAll() + "\n";
	}
	public void setAll(int notaFiscal, int dia, int mes, int ano, float total, Produto produto, Cliente cliente) {
		this.notaFiscal = notaFiscal;
		this.data = dia + "/" + mes + "/" + ano;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
	}
	//gets e sets individuais
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(int dia, int mes, int ano) {
		this.data = dia + "/" + mes + "/" + ano;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}