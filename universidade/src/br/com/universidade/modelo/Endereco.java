package br.com.universidade.modelo;

public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	private String complemento;
	//metodos get all e set all
	public String getAll() {
		return
				"Logradouro: " + this.logradouro + "\n" +
				"Bairro: " + this.bairro + "\n" +
				"Cidade: " + this.cidade + "\n" +
				"Estado: " + this.estado + "\n" +
				"CEP: " + this.cep + "\n" +
				"N�mero: " + this.numero + "\n" +
				"Complemento: " + this.complemento + "\n";
	}
	public void setAll(
			String logradouro,
			String bairro,
			String cidade,
			String estado,
			String cep,
			String numero,
			String complemento
			) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	// gets e sets individuais
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
