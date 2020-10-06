package br.com.excecao.teste;

public class TesteExcecao {
	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("1");
			System.out.println(numero);
			
			String palavra = "teste";
			System.out.println(palavra.length());
			
			int valores[] = new int[2];
			valores[0] = 548;
			valores[1] = 112;
			valores[2] = 95;
					
		}catch(NumberFormatException e) {
			System.err.println("Número Inválido");
		}catch(NullPointerException e) {
			System.err.println("Objeto Nulo");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("Vetor Estorou");
		}catch(Exception e) {
			System.out.println("Excecao Desconhecida");
		}finally {
			System.out.println("Até logo");
		}
	}
}
