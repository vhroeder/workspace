package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class ImplementacaoProfessor {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		Professor professor = new Professor();
		professor.setId(987267174);
		professor.setFormacao("Superior Completo");
		professor.setNome("Victor Roeder");
		professor.setValorHora(4000, 160);
		System.out.println(professor.getAll());
		System.out.println("=============");
		System.out.println(professor.getId());
		System.out.println("=============");
		System.out.println(professor.getNome());
		System.out.println("=============");
		System.out.println(professor.getValorHora());
		System.out.println("=============");
		System.out.println(professor.getFormacao());
		
	}

}
