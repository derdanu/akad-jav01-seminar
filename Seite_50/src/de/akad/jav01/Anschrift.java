package de.akad.jav01;

public class Anschrift {

	private String ort;
	private String strasse;
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public String getStrasse() {
		return strasse;
	}
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	public String toString() {
		return this.ort + ", " + this.strasse;		
	}
	
}

