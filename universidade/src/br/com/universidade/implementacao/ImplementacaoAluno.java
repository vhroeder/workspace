package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class ImplementacaoAluno {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		Aluno estudante = new Aluno();
		estudante.setAll(Integer.parseInt(JOptionPane.showInputDialog("Matrícula")), JOptionPane.showInputDialog("Nome Completo"), endereco);
		System.out.println(estudante.getAll());
	}
}