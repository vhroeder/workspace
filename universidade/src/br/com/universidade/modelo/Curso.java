package br.com.universidade.modelo;

public class Curso {
	private Formacao formacao;
	private String sigla;
	private String dataLancamento;
	// construtores
	public Curso(Formacao formacao, String sigla, String dataLancamento) {
		this.formacao = formacao;
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
	}
	
	public Curso() {
		
	}
	
	//get all e set all
	
	public String getAll() {
		return
				"Dados da formação:\n" +
				this.formacao.getAll() + "\n\n" +
				"Sigla: " + this.sigla + "\n" +
				"Data de Lançamento: " + this.dataLancamento;
	}
	
	public void setAll(Formacao formacao, String sigla, String dataLancamento) {
		this.formacao = formacao;
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
	}
	
	//gets e sets individuais

	public Formacao getFormacao() {
		return formacao;
	}

	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(int dia, int mes, int ano) {
		this.dataLancamento = dia + "/" + mes + "/" + ano;
	}
}
