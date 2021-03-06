package variaveis;

import javax.swing.JOptionPane;

public class Variavel {
	//Variavel � um espa�o tempor�rio na mem�ria RAM onde voc� armazena UM dado
	public static void main(String[] args) {
		// Sintaxe para criar variavel:
		//<tipo de dado> <nome da variavel>;
		/*
		 * Tipos de dados:
		 * A) Num�rico: o dado que ser� utilizado em uma opera��o matem�tica.
		 * tambem sao para dados que precisam de processassemento mais r�pido (exemplo do CEP dos correios)
		 * B) Alfanum�rico: n�o � utilizado para opera��es matem�ticas.
		 * 
		 */
		String nome = ""; //tipo de dado por Refer�ncia (porque ele � uma classe)
		int idade = 0; //tipo numerico inteiro primitivo
		double altura = 0; //tipo numerico real primitivo
		double peso = 0;
		
		/*
		 * Para converter (parse) uma string para um tipo primitivo utilizamos as classes "Wrapper's", conforme o tipo primitivo:
		 * Double para double
		 * Float para float
		 * Short para short
		 * etc.
		 */
		nome = JOptionPane.showInputDialog("Digite seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura + "m");
		System.out.println("Peso: " + peso + "kg");
		System.out.println("IMC: " + imc);
	}

}
