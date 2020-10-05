package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao {
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	//construtores

	public Bacharelado(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public Bacharelado() {
		super();
	}
		
	//get all e set all
	
	public String getAll() {
		return
				"Projeto de conclus�o: " + this.projetoConclusao + "\n" +
				"Carga Hor�ria de Est�gio: " + this.cargaHorariaEstagio + "\n" +
				super.getAll();
	}
	public void setAll(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super.setAll(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
		
	//gets e sets individuais
	
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/48 * fator;
	}
	@Override
	public void definirDuracao() {
		setDuracao(48);
		
	}

}
	