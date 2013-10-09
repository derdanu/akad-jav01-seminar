package de.akad.jav01;

public class Kreis extends GeomFigur {

	private int radius;
	
	public Kreis(int x, int y, int radius) {
		
		super(x, y);
		this.radius = radius;
		
	}
	
	@Override
	public void zeichnen() {
		System.out.println("Ich bin ein Kreis");
	}

	@Override
	public double flaecheBerechnen() {
		return (this.radius * this.radius * Math.PI);
	}

	@Override
	public double umfangBerechnen() {
		return (2 * this.radius * Math.PI);
	}

	
	
}
