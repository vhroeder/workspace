package decisao;

import javax.swing.JOptionPane;

public class ListaExercicio1 {

	public static void main(String[] args) {
		//conta do cliente
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de di�rias"));
		//di�rias menor que 15: taxa de servi�o de R$ 8.00
		if (diarias < 15) {
			System.out.println("A conta dessa hospedagem � de: R$ " + (float) diarias * 88.00);
		}
		//di�rias iguais a 15: taxa de servi�o de R$ 6.00
		else if (diarias == 15) {
			System.out.println("A conta dessa hospedagem � de: R$ " + (float) diarias * 86.00);
		}
		//di�rias maior que 15: taxa de servi�o de R$ 5.50
		else {
			System.out.println("A conta dessa hospedagem � de: R$ " + (float) diarias * 85.50);
		}
	}
}
