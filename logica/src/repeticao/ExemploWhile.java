package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		// pedir o nome da pessoa e só aceitar quando o mesmo tiver entre 5 e 15 carácteres
		String nome = JOptionPane.showInputDialog("Nome").toLowerCase();
		while (nome.length() < 5 || nome.length() > 15) {
			System.out.println("Nome invalido");
			nome = JOptionPane.showInputDialog("Nome").toLowerCase();
		}
		System.out.println(nome);
	}

}
