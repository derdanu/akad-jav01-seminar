package de.akad.jav01;

public class Giro extends Konto implements Druckbar {

	private int limit;
	
	public void ausgabe() {
		System.out.println("Kontonummer: " + this.getNummer() + "; Saldo: " + this.getSaldo() + " Limit: " + this.limit);
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
