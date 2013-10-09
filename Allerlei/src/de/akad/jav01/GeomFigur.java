package de.akad.jav01;

public abstract class GeomFigur {

	private int xKoordinate;
	private int yKoordinate;
	
	public GeomFigur(int x, int y) {
		
		this.xKoordinate = x;
		this.yKoordinate = y;
		
	}
	
	public abstract void zeichnen();
	public abstract double flaecheBerechnen();
	public abstract double umfangBerechnen();
	
}
