package br.com.lojauati.modelo;

public class Televisao {
	private boolean status;
	private int canal = 1;
	private int volume;
	
	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}
	public void mudarCanal (int pCanal) {
		if (status == true) {
			if (pCanal > 0) {
				canal = pCanal;
			}
		}
	}
	public void aumentarVolume() {
		if (status == true && volume < 100){
			volume++;
		}
	}
	public void diminuirVolume() {
		if (status == true && volume > 0) {
			volume--;
		}
		
	}
	public boolean exibirStatus() {
		return status;
	}
	public String exibirTudo() {
		return
				"Status: " + status + "\n" +
				"Canal: " + canal + "\n" +
				"Volume: " + volume + "\n";
	}
}
