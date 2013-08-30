package de.akad.jav01;


public class Karte {

	private Typ typ;
	private Art art;
	
	public Karte(Typ typ, Art art) {
		
		this.typ = typ;
		this.art = art;
	}
	
	public Typ getTyp() {
		return this.typ;
	}
	
	public Art getArt() {
		return this.art;
	}
	
	public String toString() {
		return this.typ + " " + this.art;
	}
	
}
