package de.akad.jav01;

public class Produkt {

	private Produktbeschreibung beschreibung;
	private Produktpreis preis; 

	public Produkt(Produktbeschreibung beschreibung, Produktpreis preis) {
		
		this.beschreibung = beschreibung;
		this.preis = preis;
		
	}
		
	public String getBeschreibung() {
		
		return this.beschreibung.toString();
		
	}
	
	public Produktpreis getPreis() {
		
		return this.preis;
	}
		
	
	public String toString() {
		
		return new String(beschreibung + " kostet " + Produktpreis.get(this.preis));
	
	}
	
}
