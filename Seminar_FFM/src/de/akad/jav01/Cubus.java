package de.akad.jav01;

public class Cubus {

	private int hoehe;
	private int breite;
	private int laenge;
	
	public Cubus() {
		
	}
	
	public Cubus(int hoehe, int laenge, int breite) {
		
		this.hoehe = hoehe;
		this.laenge = laenge;
		this.breite = breite;
		
	}
	
	public int berechneInhalt() {
		
		return this.laenge * this.hoehe * this.breite;
		
	}
	
	public int getHoehe() {
		return hoehe;
	}
	
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public int getBreite() {
		return breite;
	}
	
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public int getLaenge() {
		return laenge;
	}
	
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	
	public String toString() {
		
		return "Hoehe: " + this.hoehe + " Breite: " + this.breite + " Laenge: " + this.laenge;
		
	}
	
}
