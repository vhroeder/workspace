package br.com.universidade.modelo;
/*
 * Design patterns: melhores pr�ticas para projetos com OO:
 * DTO (Data Transfer Object)
 * 1� sugest�o: todos os atributos devem ser privados
 * 2� sugest�o: cada atributo deve ter seu m�todo getter (output) e setter (input)
 */
public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;

	public void setAll(int rm, String nome, Endereco endereco) {
		this.rm = rm;
		this.nome = nome.toUpperCase();
		this.email = this.nome.substring(0, this.nome.indexOf(" ",0)).toLowerCase() + "." + "aluno@universidade.com.br";
		this.endereco = endereco;
	}
	public String getAll(){
		return
				"Matr�cula: " + rm +"\n" +
				"Nome: " + nome + "\n" +
				"E-mail: " + email+ "\n" +
				"Endereco: " + endereco.getAll(); 
	}
	public String getRm(){
		return
				"Matr�cula: " + rm;
	}
	public String getNome(){
		return
				"Nome: " + nome;
	}
	public String getEmail(){
		return
				"E-mail: " + email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
}