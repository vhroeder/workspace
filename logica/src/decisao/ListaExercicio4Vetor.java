package decisao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ListaExercicio4Vetor {

	public static void main(String[] args) {
		int vetor[] = {0,0,0};
		for (int i = 0; i < 3; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "� n�mero"));
		}
		Arrays.sort(vetor);
		System.out.println("N�meros ordenados: " + Arrays.toString(vetor));
	}
}