package br.com.universidade.modelo;

public class Turma {
	private String nome;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	//construtores
	public Turma(String nome, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.nome = nome;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}

	public Turma() {
		super();
	}
	//get all e set all
	public String getAll() {
		return
				"Nome da turma: " + this.nome + "\n" +
				"Período: " + this.periodo + "\n" +
				"\nDados do curso: \n" +
				this.curso.getAll() + "\n" +
				"\nDados do Aluno: \n" +
				this.aluno.getAll() + "\n" +
				"\nDados do Professor: \n" +
				this.professor.getAll();
	}
	
	//gets e sets individuais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
