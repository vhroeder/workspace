package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// Solicitar os dados:
		// nome do produto:
		// quantidade:
		// valor:
		// Exibir o total e o nome do produto
		// Exibir o total com 10% de desconto
		
		String nomeproduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário: "));
		double valortotal = quantidade * valor;
		
		System.out.println("Valor total: R$ " + valortotal + " Nome do Produto: " + nomeproduto);
		System.out.println("Valor com desconto (10%): R$ " + (valortotal * 0.9));
	}

}
