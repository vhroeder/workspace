package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeralJava {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas
		 * ao terminar (o usuário respondeu que não quer continuar):
		 * o programa deverá exibir:
		 * - a pessoa mais velha
		 * - a pessoa mais nova
		 * - a quantidade de pessoas maiores de idade
		 * - e a média entre as idades que foram digitadas
		 */
		String nome = "";
		short idade = 0;
		short idadeMaisVelha = 0;
		String nomeMaisVelha = "";
		short idadeMaisNova = 127;
		String nomeMaisNova = "";
		int somaIdades = 0;
		int quantidadeDePessoas = 0;
		int quantidadeMaiorDeIdade = 0;
		char continuar = 0;
		do {
			nome = JOptionPane.showInputDialog("Nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			quantidadeDePessoas++;
			somaIdades = somaIdades + idade;
			if (idade >= 18) {
				quantidadeMaiorDeIdade++;
			}
			if (quantidadeDePessoas == 1) {
				nomeMaisVelha = nome;
				idadeMaisVelha = idade;
				nomeMaisNova = nome;
				idadeMaisNova = idade;
			}else if (idade >= idadeMaisVelha) {
				nomeMaisVelha = nome;
				idadeMaisVelha = idade;
			}else if (idade <= idadeMaisNova) {
				nomeMaisNova = nome;
				idadeMaisNova = idade;
			}
			continuar = JOptionPane.showInputDialog("Deseja continuar? (digite <S> se sim).").toUpperCase().charAt(0);
		}while(continuar == 'S');
		System.out.println("A pessoa mais velha se chama: " + nomeMaisVelha + " e tem " + idadeMaisVelha + " anos.");
		System.out.println("A pessoa mais nova se chama: " + nomeMaisNova + " e tem " + idadeMaisNova + " anos.");
		System.out.println("Foram inseridas " + quantidadeMaiorDeIdade + " pessoas maiores de idade.");
		System.out.println("A média de idade das pessoas inseridas é de aproximadamente: " + (somaIdades / quantidadeDePessoas) + " anos.");
	}
}
