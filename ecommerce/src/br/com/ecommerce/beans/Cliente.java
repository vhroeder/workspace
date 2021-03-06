package br.com.ecommerce.beans;

/*
 * DTO => classes do tipo modelo / beans / JavaBeans
 * 1� Todos os atributos devem ser privados
 * 2� Todos os atributos devem ter seus getters e setters
 * 3� Toda classe deve ter no m�nimo 2 construtores (um vazio e outro cheio [com todos os atributos] )
 */

public class Cliente {
	private int id;
	private String nome;
	private Endereco endereco;
	//get all e set all
	public Cliente() {
		
	}
	public Cliente(int i, String n, Endereco e) {
		id = 1;
		nome = n;
		endereco = e;
	}
	public String getAll() {
		return
				"ID do cliente: " + this.id + "\n" +
				"Nome do Cliente: " + this.nome + "\n\n" +
				"Dados do Endere�o:\n" +
				endereco.getAll() + "\n";
	}
	public void setAll(int id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	//gets e sets individuais
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
