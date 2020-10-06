package br.com.colecoes.modelo;

public class Cargo {
	private String nome;
	private String nivel;
	private float salario;
	
	public String getAll() {
		return "Cargo: " + this.nome + "\nNível: " + nivel + "\nSalário: " + salario;
	}
	
	public void setAll(String nome, String nivel, float salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	public Cargo(String nome, String nivel, float salario) {
		super();
		this.nome = nome;
		this.nivel = nivel.toUpperCase();
		this.salario = salario;
	}

	public Cargo() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel.toUpperCase();
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
