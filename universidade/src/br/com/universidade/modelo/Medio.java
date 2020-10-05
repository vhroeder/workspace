package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao {
	private int tipo;
	//construtores

	public Medio(float valor, String descricao, int duracao, int tipo) {
		super(valor, descricao, duracao);
		this.tipo = tipo;
	}
	public Medio() {
		super();
	}
	
		
	//get all e set all
	
	public String getAll() {
		return
				"Tipo: " + this.tipo + "\n" +
				super.getAll();
	}
	public void setAll(float valor, String descricao, int duracao, int tipo) {
		super.setAll(valor, descricao, duracao);
		this.tipo = tipo;
	}
	
	//gets e sets individuais
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/36 * fator;
	}
	@Override
	public void definirDuracao() {
		setDuracao(36);
	}
}
