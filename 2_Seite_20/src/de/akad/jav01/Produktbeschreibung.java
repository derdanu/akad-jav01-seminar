package de.akad.jav01;

public class Produktbeschreibung {

	private String gruppe;
	private String beschreibung;
	
	public Produktbeschreibung(String gruppe, String beschreibung) {
		
		this.gruppe = gruppe;
		this.beschreibung = beschreibung;
		
	}
	
	public String toString() {
		
		return this.gruppe + " -> " + this.beschreibung;
	}
	
}
