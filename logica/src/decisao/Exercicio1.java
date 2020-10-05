package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/* 
		 * Solicite para o usu�rio:
		 * nome do cliente, valor investido, tempo (anos) de fidelidade, regi�o onde mora (n�vel Brasil)
		 * 
		 *  se a regi�o for sul ou sudeste, o tempo de fidelidade tem peso 1.2 (acr�scimo de 20%)
		 *  se o valor investido for menor que 1000, aplique um acr�scimo de 1.5% no valor investido
		 *  se o valor investido estiver entre 1000 e 5000, aplique um acr�scimo de 2% no valor investido
		 *  se o valor investido for maior que 5000, aplique um acr�scimo de 3%
		 *  se a fidelidade for maior que 5 anos, aplique mais um acr�scimo de 1% no valor investido
		 *  no final, exiba:
		 *  o valor investido atualizado;
		 *  a diferen�a que foi obtida entre o valor investido e o valor atual
		 */
		
		String nomeDoCliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		float valorInvestido = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor investido inicial"));
		float tempoFidelidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo de fidelidade (em anos"));
		String regiao = JOptionPane.showInputDialog("Digite a regi�o onde mora");
		//Valida se a regi�o � Sul ou Sudeste
		// para true, n�o precisa do == | para false, basta colocar ! no come�o da opera��o
		if (regiao.equalsIgnoreCase("sul") == true || regiao.equalsIgnoreCase("sudeste") == true ) {
			tempoFidelidade = tempoFidelidade * (float) 1.2;
		}
		//acr�scimo de 1.5% se valor investido � menor que 1000
		float valorAtual = 0;
		if (valorInvestido < 1000) {
			valorAtual = valorInvestido * (float) 1.015;
		}
		//acr�scimo de 3% se valor investido � maior que 5000
		else if (valorInvestido > 5000) {
			valorAtual = valorInvestido * (float) 1.03;
		}
		//acr�scimo de 2% se valor Investido � entre 1000 e 5000 (n�o � nem menor que 1000 e nem maior que 50000)
		else {
			valorAtual = valorInvestido * (float) 1.02;
		}
		// acr�scimo de 1% se a fidelidade for maior que 5 anos
		if (tempoFidelidade > 5) {
			valorAtual = valorAtual * (float) 1.01;
		}
		//exibi��o dos resultados
		System.out.println("O valor investido atualmente � de: R$" + valorAtual);
		System.out.println("A diferen�a para o valor inicial � de: R$" + (float) (valorAtual - valorInvestido));
	}
}
