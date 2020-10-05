package br.com.lojauati.teste;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula2 {

	public static void main(String[] args) {
		Formula1 objeto = new Formula1();
		objeto.preencherTudo("McLaren", "Africa", 2018, 1000, 6);
		System.out.println(objeto.exibirTudo());
	}

}
