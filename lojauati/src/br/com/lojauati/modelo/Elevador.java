package br.com.lojauati.modelo;


public class Elevador {
	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;
	
	public Elevador() {

	}
	// <modificador> <tipo_retorno> <nome>(<tipo_param1> <nome_param1>, <tipo_param2> <nome_param2>,...)
	public void preencherMaiorAndar(int pAndar) {
		if (pAndar > menorAndar) {
			maiorAndar = pAndar;
		}
	}
	public void preencherMenorAndar(int pAndar) {
		if (pAndar < maiorAndar) {
			menorAndar = pAndar;
		}
	}
	public void preencherCapacidadePessoas(int pPessoas) {
		if (pPessoas > 0){
			capacidadePessoas = pPessoas;
		}
	}
	public void entrar(int pPessoas) {
		if (pPessoas > 0 && (qtdePessoas + pPessoas) <= capacidadePessoas)
		{
			qtdePessoas += pPessoas; 
		}
	}
	public void sair(int pPessoas) {
		if (pPessoas > 0 && qtdePessoas >= pPessoas)
		{
			qtdePessoas -= pPessoas; 
		}
	}
	public void subir() {
		if (andarAtual < maiorAndar) {
			andarAtual++;
		}
	}
	public void descer() {
		if (andarAtual > menorAndar) {
			andarAtual--;
		}
	}
	public String exibirTudo() {
		return
				"Capacidade m�ximia: " + capacidadePessoas + " pessoas. \n" +
				"Quantidade de pessoas atual: " + qtdePessoas + " pessoas. \n" +
				"Andar atual: " + andarAtual + "� andar. \n" +
				"Menor andar: " + menorAndar + "� andar. \n" +
				"Maior andar: " + maiorAndar + "� andar.";
	}
}