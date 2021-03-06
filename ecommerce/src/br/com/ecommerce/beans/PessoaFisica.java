package br.com.ecommerce.beans;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String rg;
	private String nascimento;
	
	public void setAll(int i, String n, Endereco e, String cpf, String rg, String nascimento) {
		super.setAll(i, n, e);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"CPF: " + this.cpf + "\n" +
				"RG: " + this.rg + "\n" +
				"Nascimento: " + this.nascimento;
	}
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int i, String n, Endereco e, String cpf, String rg, String nascimento) {
		super(i, n, e);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
}
