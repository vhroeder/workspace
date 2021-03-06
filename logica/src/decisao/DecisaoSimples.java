package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	/*
	 * Identificadores = nomes (classe, variavel...)
	 * Regras:
	 * 1� N�o come�ar�s com n�mero: 1berto (errado), h1berto (certo)
	 * 2� N�o usar�s car�cteres especiais (@. #, -) Exce��o: underline (_)
	 * 3� N�o usar�s palavras reservadas da linguagem (while, string, class)
	 *  
	 * Padr�es (vari�veis):
	 * - nomes significativos
	 * - sempre come�am com letras min�sculas
	 * - utilizar o padr�o Camel Case
	 * 
	 */
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3"));
		float media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Aluno: " + nome + " sua m�dia foi: " + media);
		if (media >= 6) {
			System.out.println("Parab�ns " + nome + "! Voc� est� aprovado!");
		}
		//Exerc�cio: mostrar menagem "Infelizmente xxxx voc� foi reprovado! se m�dia < 4
		if (media < 4) {
			System.out.println("Infelizmente " + nome + " voc� foi reprovado!");
		}
		// and => &&
		// or => ||
		//Exerc�cio: se a media estiver entre 5.9 e 4 tem que mostrar "XXXX voc� ainda tem chance no exame
		if (media >= 4 && media < 6) {
			System.out.println(nome + " voc� ainda tem chance no exame!");
		}
	}

}
