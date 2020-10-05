package br.com.universidade.modelo;

public class Professor {
	private int id;
	private String nome;
	private float valorHora;
	private String formacao;
	private Endereco endereco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float salario, int cargaHoraria) {
		this.valorHora = salario / cargaHoraria;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao.toUpperCase();
	}
	public String getAll() {
		return
				"ID: " + this.id + "\n" +
				"Nome: " + this.nome + "\n" +
				"Valor Hora: R$ " + this.valorHora + "/hora\n" +
				"Formação: " + this.formacao + "\n\n" +
				"Dados de endereço:\n" +
				endereco.getAll();
	}
	public void setAll(int id, String nome, float valorHora, String formacao, Endereco endereco) {
		this.id = id;
		this.nome = nome.toUpperCase();
		this.valorHora = valorHora;
		this.formacao = formacao.toUpperCase();
		this.endereco = endereco;
	}
}
