package br.com.lojauati.modelo;

public class Formula1 {
	private String escuderia;
	private float valor;
	private int rpm;
	/*
	 * s�ntaxe para cria��o de m�todos no Java:
	 * <modificador> <tipo do retorno> <nomeDoMetodo> (<tipo do parametro> <nome do parametro>) 
	 */
	
	
	/*
	 * crie um m�todo para preencher tudo - preencherTudo()
	 * crie um m�todo para exibir tudo - exibirTudo()
	 * crie um m�todo para exibir o valor com 10% - exibirPromocao()
	 * crie um m�todo para exibir o valor com desconto a ser recebido por parametro - exibirPromocao()
	 */
	public void preencherTudo(String nomeEscuderia, String continenteFabricacao, float anoDeFabricacao, int potencia, int cilindros) {
		escuderia = nomeEscuderia.toUpperCase();
		float taxaAnoFabricacao = 1;
		float taxaContinenteFabricacao = 1;
		if (continenteFabricacao.contentEquals("Europa")) {
			taxaContinenteFabricacao = (float)1.5;
		}
		if (anoDeFabricacao < 2010) {
			taxaAnoFabricacao = (float) 0.6;
		}
		valor = 1000000 * taxaAnoFabricacao * taxaContinenteFabricacao;
		rpm = potencia * cilindros * 10;
	}
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;
	}
	public float exibirPromocao(float taxaDeDesconto) {
		return valor*(float) (1-taxaDeDesconto);
	}
	public void preencherEscuderia (String nomeEscuderia) {
		escuderia = nomeEscuderia.toUpperCase();
	}
	public String exibirEscuderia() {
		return escuderia;
	}
	public void calcularValor(String continenteFabricacao, float anoDeFabricacao) {
		float taxaAnoFabricacao = 1;
		float taxaContinenteFabricacao = 1;
		if (continenteFabricacao.contentEquals("Europa")) {
			taxaContinenteFabricacao = (float)1.5;
		}
		if (anoDeFabricacao < 2010) {
			taxaAnoFabricacao = (float) 0.6;
		}
		valor = 1000000 * taxaAnoFabricacao * taxaContinenteFabricacao;
	}
	public float exibirValor(){
		return valor;
	}
	public void calcularRpm (int potencia, int cilindros) {
		rpm = potencia * cilindros * 10;
	}
	public int exibirRpm() {
		return rpm;
	}
}