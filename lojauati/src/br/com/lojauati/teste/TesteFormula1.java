package br.com.lojauati.teste;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		//Formula1 objeto; //criando um objeto
		//objeto.preencherEscuderia("ferrari"); N�O FUNCIONA
		
		Formula1 carro = new Formula1(); //instanciando um objeto
		carro.preencherTudo("Ferrari", "Europa", 2010, 800, 6);
		System.out.println(carro.exibirTudo());
		System.out.println(carro.exibirPromocao((float)0.1));
	}
}
