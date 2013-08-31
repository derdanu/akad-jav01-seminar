package de.akad.jav01;

public class Kleinkunde extends Dauerkunde {

	private final double rabatt = 0.0025;
	
	public double berechneRabatt(double umsatz) {
	
		return umsatz * this.rabatt;
		
	}

	public String toString() {
		
		return "Kleinkundenrabatt: " + this.rabatt + "; Name: " + this.getName() + "; Jahresumsatz: " + this.getGesamtUmsatz() + "; Jahresrabatt: " + this.getJahresRabatt();

	}
	
}
