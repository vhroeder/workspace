package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		System.out.println(tv.exibirTudo());
		tv.ligar();
		System.out.println("================");
		System.out.println(tv.exibirStatus());
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.diminuirVolume();
		tv.diminuirVolume();
		tv.mudarCanal(50);
		System.out.println("================");
		System.out.println(tv.exibirTudo());
		tv.desligar();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.mudarCanal(69);
		System.out.println("================");
		System.out.println(tv.exibirTudo());
		tv.ligar();
		tv.mudarCanal(69);
		for (int i = 1; i < 2000; i++) {
			tv.aumentarVolume();
		}
		System.out.println("================ ") ;
		System.out.println(tv.exibirTudo());
	}
}