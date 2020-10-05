package decisao;

import javax.swing.JOptionPane;

public class ListaExercicio1 {

	public static void main(String[] args) {
		//conta do cliente
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de diárias"));
		//diárias menor que 15: taxa de serviço de R$ 8.00
		if (diarias < 15) {
			System.out.println("A conta dessa hospedagem é de: R$ " + (float) diarias * 88.00);
		}
		//diárias iguais a 15: taxa de serviço de R$ 6.00
		else if (diarias == 15) {
			System.out.println("A conta dessa hospedagem é de: R$ " + (float) diarias * 86.00);
		}
		//diárias maior que 15: taxa de serviço de R$ 5.50
		else {
			System.out.println("A conta dessa hospedagem é de: R$ " + (float) diarias * 85.50);
		}
	}
}
