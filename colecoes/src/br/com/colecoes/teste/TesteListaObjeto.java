package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		List<Cargo> listaMaior5k = new ArrayList<Cargo>();
		//Cargo objeto = new Cargo();
		//objeto.setNome(JOptionPane.showInputDialog("Cargo"));
		//objeto.setNivel(JOptionPane.showInputDialog("Nível"));
		//objeto.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario")));
		//lista.add(objeto);
		//System.out.println(lista.get(0).getAll());
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Cargo"),
					JOptionPane.showInputDialog("Nível"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))
					));
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		double total=0;
		int totaljr=0;
		int totalsr=0;
		for (Cargo obj : lista) {
			System.out.println(obj.getAll());
			total +=obj.getSalario();
			if (obj.getSalario() > 5000) {
				listaMaior5k.add(obj);
			}
			if (obj.getNivel().equals("JR")) {
				totaljr++;
			}else if (obj.getNivel().equals("SR")) {
				totalsr++;
			}
		}
		System.out.println("Salarios Maiores que 5000");
		for (Cargo obj : listaMaior5k) {
			System.out.println(obj.getAll());
			}
		
		//System.out.println("Total: " + total);
		//System.out.println("Total de Jr: " + totaljr);
		//System.out.println("Total de Sr: " + totalsr);
	}
//retorne uma nova lista somente com os salários maiores que 5000
}
