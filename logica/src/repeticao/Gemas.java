package repeticao;

import javax.swing.JOptionPane;

public class Gemas {

	public static void main(String[] args) {
		int gemas = 1;
		int totalgemasreserva = 0;
		while (gemas > 0) {
			gemas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de gemas"));
			totalgemasreserva = totalgemasreserva + gemas;
		}
		int totalgemas = totalgemasreserva + 9999;
		System.out.println("Voc� possui um total de: " + totalgemas + " gemas!");
		System.out.println("Voc� consegue comprar " + (totalgemas / 50) + " packs!");
	}
}