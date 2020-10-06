package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * Collection framework => uma API para armazenar multiplos dados
		 */
		//String x[] = new String[2]
		
		//Collection com generics
		List<String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("ANALISTA");
		lista.add("ESTAGIÁRIO");
		System.out.println(lista);
		System.out.println("Segundo elemento da lista: " + lista.get(1));
		//lista.remove(2);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		/*
		 * For é formado por 3 parâmetros:
		 * - início do contador
		 * - a condição para ele terminar
		 * - o incremento do contador
		 */
		for(int contador = 0; contador < lista.size(); contador++) {
			System.out.println(lista.get(contador));
		}
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
	}

}
