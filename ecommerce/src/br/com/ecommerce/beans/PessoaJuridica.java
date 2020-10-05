package br.com.ecommerce.beans;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String ie;
	private String contato;
	public void setAll(int i, String n, Endereco e, String cnpj, String ie, String contato) {
		super.setAll(i, n, e);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	public String getAll() {
		return
				super.getAll() + "\n" +
				"CNPJ: " + this.cnpj + "\n" +
				"Inscrição Estadual: " + this.ie + "\n" +
				"Contato: " + this.contato;
	}
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(int i, String n, Endereco e, String cnpj, String ie, String contato) {
		super(i, n, e);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	
}
