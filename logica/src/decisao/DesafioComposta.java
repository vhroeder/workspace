package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		/*
		 * pedir o total de faltas
		 * se o total de faltas > 20, ele est� reprovado, independemente da nota
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de faltas"));
		if (faltas >= 20 ) {
			System.out.println("Infelizmente " + nome + " voc� foi reprovado!");
		}
		else{
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
			float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3"));
			float media = (nota1 + nota2 + nota3) / 3;
			System.out.println("Aluno: " + nome + " sua m�dia foi: " + media);
			if (media < 4) {
				System.out.println("Infelizmente " + nome + " voc� foi reprovado!");
			} else if (media >= 6) {
				System.out.println("Parab�ns " + nome + "! Voc� est� aprovado!");
			} else {
				System.out.println(nome + " voc� ainda tem chance no exame!");
			}
		}
	}

}
