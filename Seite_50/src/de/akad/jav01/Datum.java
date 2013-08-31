package de.akad.jav01;

public class Datum {

	private int tag;
	private int monat;
	private int jahr;
	
	public int getTag() {
		return tag;
	}
	
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public int getMonat() {
		return monat;
	}
	
	public void setMonat(int monat) {
		this.monat = monat;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	public String toString() {
		return this.tag + "." + this.monat + "." + this.jahr;		
	}
	
	
}
