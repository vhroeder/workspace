package br.com.integracao.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_musica")
public class Musica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="titulo")
	private String titulo;
	@Column(name="lancamento")
	private int lancamento;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy", shape=JsonFormat.Shape.STRING)
	@Column(name="cadastro")
	private Date cadastro;
	@ManyToOne
	@JsonIgnoreProperties("musicas")
	private Artista artista;
	public Musica(int id, String titulo, int lancamento, Date cadastro, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		this.artista = artista;
	}
	
	public Musica() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getLancamento() {
		return lancamento;
	}
	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
	public Date getCadastro() {
		return cadastro;
	}
	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
}