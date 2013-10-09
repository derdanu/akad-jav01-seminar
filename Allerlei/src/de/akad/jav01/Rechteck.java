package de.akad.jav01;

public class Rechteck extends GeomFigur {

	private int breite;
	private int laenge;
	
	public Rechteck(int x, int y, int breite, int laenge) {
		
		super(x, y);
		this.breite = breite;
		this.laenge = laenge;
		
	}
	
	@Override
	public void zeichnen() {
		System.out.println("Ich bin ein Rechteck");	
	}

	@Override
	public double flaecheBerechnen() {
		return (this.laenge * this.breite);
	}

	@Override
	public double umfangBerechnen() {
		return 2 * (this.laenge + this.breite);
	}
	
	

}
