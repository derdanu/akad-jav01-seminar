package de.akad.jav01;

public class Binaerzahl {

	private String string;
	
	public Binaerzahl(String s) {
		
		this.string = s;
		
	}
	
	public Binaerzahl addiere(Binaerzahl b) {
		
		int x = Integer.parseInt(this.string, 2);
		int y = Integer.parseInt(b.toString(), 2); 
		
		int z = x + y;
		
		return new Binaerzahl(Integer.toString(z, 2));
		
	}
	
	public Binaerzahl multipliziere(Binaerzahl b) {
		
		int x = Integer.parseInt(this.string, 2);
		int y = Integer.parseInt(b.toString(), 2); 
		
		int z = x * y;
		
		return new Binaerzahl(Integer.toString(z, 2));
		
	}
	
	public String toString() {
		
		return this.string;
		
	}
	
	public String getZahl() {
		
		return String.valueOf(Integer.parseInt(this.string, 2));
		
	}
}
