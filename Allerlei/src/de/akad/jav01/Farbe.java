package de.akad.jav01;

public enum Farbe {
	
	Schwarz ("schwarz"),
	Rot ("rot"),
	Gold ("gold");
	
	private String farbe;
	
	private Farbe(String farbe) {
		this.farbe = farbe;
	}

	public String toString() {
		
		return "Die Farbe ist: " + this.farbe;
				
	}
	
	
}
