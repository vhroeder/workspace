package decisao;

import javax.swing.JOptionPane;

public class ListaExercicio4 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número"));
		if (numero3 >= numero2 && numero3 >= numero1) {
			System.out.println(numero3);
			if (numero2 >= numero1) {
				System.out.println(numero2);
				System.out.println(numero1);
				}
			else {
				System.out.println(numero1);
				System.out.println(numero2);
			}
		}
		else if (numero2 >= numero1 && numero2 >= numero3){
			System.out.println(numero2);
			if (numero3 >= numero1) {
				System.out.println(numero3);
				System.out.println(numero1);
				}
			else {
				System.out.println(numero1);
				System.out.println(numero3);
			}
		}
		else {
			System.out.println(numero1);
			if (numero3 >= numero2) {
				System.out.println(numero3);
				System.out.println(numero2);
				}
			else {
				System.out.println(numero2);
				System.out.println(numero3);
			}
		}
	}
}