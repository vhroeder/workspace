package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		/*
		 * Jogador 1: vai digitar um n�mero inteiro
		 * Jogador 2: tem que descobrir esse n�mero
		 * Exibir o parab�ns para o jogador 2 quando ele descobrir
		 * ----atualiza��es----
		 * 1 - o jogador 2 ir� receber dicas enquanto ele n�o acertar
		 * 2 - no final, tem que exibir quantas tentativas foram utilizadas pelo jogador 2
		 */
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1: Digite o valor a ser adivinhado"));
		int valor2 = 0;
		int tentativas = 0;
		do {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: tente acertar o valor do jogador 1"));
			if (valor2 < valor1) {
				System.out.println("Resposta errada! Sua tentativa (" + valor2 + ") foi menor que a resposta certa! Tente novamente!");
			}else if (valor2 > valor1) {
				System.out.println("Resposta errada! Sua tentativa (" + valor2 + ") foi maior que a resposta certa! Tente novamente!");
			}
			tentativas++;
		}while (valor2 != valor1);
		System.out.println("Parab�ns Jogador 2. Voc� acertou! A resposta �: " + valor1 +"! Voc� acertou em: " + tentativas + " tentativas!");
	}
}