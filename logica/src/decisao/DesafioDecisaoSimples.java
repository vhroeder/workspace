package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Solicitar nome e a idade da pessoa e ir�o exibir
		 * 
		 * "� obrigado a votar => maior ou igual a 18 e menor que 70
		 * "Voto facultativo => 16, 17 ou mais que 70 anos
		 * "N�o pode votar => menores que 16 anos
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		if (idade < 16) {
			System.out.println(nome + " n�o pode votar");	
		}
		if ((idade >=16 && idade < 18) || idade >= 70) {
			System.out.println(nome + " tem voto facultativo");
		}
		if (idade >= 18 && idade < 70) {
			System.out.println(nome + " � obrigado a votar");
		}

	}

}
