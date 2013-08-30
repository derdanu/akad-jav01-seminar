package de.akad.jav01;

public class Datum {

	private int tag;
	private int monat;
	private int jahr;
	
	public int getTag() {
		return tag;
	}
	
	public int getMonat() {
		return monat;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public void setMonat(int monat) {
		this.monat = monat;
	}
	
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	public int getAnzahlTageProMont() {
		return 0;
	}
	
	public int datumUmwandlen(int tag, int monat, int jahr) {
		return 0;
	}
	
	public boolean isSchaltjahr(int jahr) {
		return true;		
	}
	
	public String toString() {
		return this.tag + "." + this.monat + "." + this.jahr;
	}
	
}
