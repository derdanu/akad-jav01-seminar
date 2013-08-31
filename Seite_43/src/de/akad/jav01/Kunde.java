package de.akad.jav01;

public abstract class Kunde {

	private final int monate = 12;
	
	private String name;
	private double[] umsatz = new double[monate];
	private double[] rabatt = new double[monate];

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void erhoeheMonatsUmsatz(double umsatz, int monat) {

		this.umsatz[m2AP(monat)] += umsatz;
		this.rabatt[m2AP(monat)] += this.berechneRabatt(umsatz);
		
	}
	
	public double getMonatsUmsatz(int monat) {
		
		return this.umsatz[m2AP(monat)];
		
	}
	
	public double getGesamtUmsatz() {
		
		double gesamt = 0;
		
		for (int i = 0; i < monate; i++) {
			
			gesamt += this.umsatz[i];
			
		}
		
		return gesamt;
	}
	
	public double getMonatsrabatt(int monat) {
		
		return this.rabatt[m2AP(monat)];
		
	}
	
	public double getJahresRabatt() {
		
		double gesamt = 0;
		
		for (int i = 0; i < monate; i++) {
			
			gesamt += this.rabatt[i];
			
		}
		
		return gesamt;
	}
	
	public String toString() {
		
		return "Jahresumsatz: " + this.getGesamtUmsatz() + "; Jahresrabatt: " + this.getJahresRabatt();
	
	}
	
	private int m2AP(int monat) {
		return monat - 1;
	}
	
	public abstract double berechneRabatt(double umsatz);
	
	
}
