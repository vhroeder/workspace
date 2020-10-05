package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/* 
		 * Solicite para o usuário:
		 * nome do cliente, valor investido, tempo (anos) de fidelidade, região onde mora (nível Brasil)
		 * 
		 *  se a região for sul ou sudeste, o tempo de fidelidade tem peso 1.2 (acréscimo de 20%)
		 *  se o valor investido for menor que 1000, aplique um acréscimo de 1.5% no valor investido
		 *  se o valor investido estiver entre 1000 e 5000, aplique um acréscimo de 2% no valor investido
		 *  se o valor investido for maior que 5000, aplique um acréscimo de 3%
		 *  se a fidelidade for maior que 5 anos, aplique mais um acréscimo de 1% no valor investido
		 *  no final, exiba:
		 *  o valor investido atualizado;
		 *  a diferença que foi obtida entre o valor investido e o valor atual
		 */
		
		String nomeDoCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		float valorInvestido = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor investido inicial"));
		float tempoFidelidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo de fidelidade (em anos"));
		String regiao = JOptionPane.showInputDialog("Digite a região onde mora");
		//Valida se a região é Sul ou Sudeste
		// para true, não precisa do == | para false, basta colocar ! no começo da operação
		if (regiao.equalsIgnoreCase("sul") == true || regiao.equalsIgnoreCase("sudeste") == true ) {
			tempoFidelidade = tempoFidelidade * (float) 1.2;
		}
		//acréscimo de 1.5% se valor investido é menor que 1000
		float valorAtual = 0;
		if (valorInvestido < 1000) {
			valorAtual = valorInvestido * (float) 1.015;
		}
		//acréscimo de 3% se valor investido é maior que 5000
		else if (valorInvestido > 5000) {
			valorAtual = valorInvestido * (float) 1.03;
		}
		//acréscimo de 2% se valor Investido é entre 1000 e 5000 (não é nem menor que 1000 e nem maior que 50000)
		else {
			valorAtual = valorInvestido * (float) 1.02;
		}
		// acréscimo de 1% se a fidelidade for maior que 5 anos
		if (tempoFidelidade > 5) {
			valorAtual = valorAtual * (float) 1.01;
		}
		//exibição dos resultados
		System.out.println("O valor investido atualmente é de: R$" + valorAtual);
		System.out.println("A diferença para o valor inicial é de: R$" + (float) (valorAtual - valorInvestido));
	}
}
