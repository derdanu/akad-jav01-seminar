package de.akad.jav01;

public class Beschreibung {

	private String pflanzenart;
	private String pflegeanleitung;
	
	public Beschreibung() {
	}
	
	public Beschreibung(String pflanzenart, String pflegeanleitung) {
		this.pflanzenart = pflanzenart;
		this.pflegeanleitung = pflegeanleitung;
	}
	
	
	public String getPflanzenart() {
		return pflanzenart;
	}
	
	public void setPflanzenart(String pflanzenart) {
		this.pflanzenart = pflanzenart;
	}
	
	public String toString() {
		return "Art: " + this.pflanzenart + "; Anleitung: " + this.pflegeanleitung;		
	}
	
	
	
}
