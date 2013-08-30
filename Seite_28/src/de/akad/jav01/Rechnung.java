package de.akad.jav01;

public class Rechnung {

	private int nummer;
	private String name;
	private int summe;
	private Datum datum;
	private Anschrift anschrift;
	
	public Rechnung(Datum datum, Anschrift anschrift) {
		
		this.datum = datum;
		this.anschrift = anschrift;
		
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSumme(int summe) {
		this.summe = summe;
	}
	
	public int getNummer() {
		return this.nummer;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSumme() {
		return this.summe;
	}
	
	public String getOrt() {
		return this.anschrift.getOrt();
	}
	
	public String getStrasse() {
		return this.anschrift.getStrasse();
	}
	
	public Datum getDatum() {
		return this.datum;
	}
	
	public int getAnzahlTageSeitRechnungsstellung(Datum heute) {
		return 0;
	}
	
	public String toString() {
		return this.nummer + ": " + this.name + " " + this.summe + " - Datum: " + this.datum.toString() + " - Anschrift: " + this.anschrift.toString();
	}
}
