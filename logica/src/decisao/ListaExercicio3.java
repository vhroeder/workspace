package decisao;

import javax.swing.JOptionPane;

public class ListaExercicio3 {

	public static void main(String[] args) {
		// coleta os n�meros
		char operador =0;
		char continuar = 0;
		//definir fora da repeti��o para economizar memoria
		int numero1 = 0;
		int numero2 = 0;
		do{
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			do {
				operador = JOptionPane.showInputDialog("Digite um operador v�lido (<+>, <->, <*>, </>").charAt(0);
			}while(operador != '+' && operador != '-' && operador != '*' && operador != '/');
			if (operador == '+') {
				System.out.println("O resultado �: " + (numero1 + numero2));
			}else if (operador == '-') {
				System.out.println("O resultado �: " + (numero1 - numero2));
			}else if (operador == '*') {
				System.out.println("O resultado �: " + (numero1 * numero2));
			}else {
				System.out.println("O resultado �: " + (float) (numero1 / numero2));
			}
			continuar = JOptionPane.showInputDialog("Deseja continuar? (se sim, digite <S>").toUpperCase().charAt(0);
		}while(continuar == 'S');
	}
}