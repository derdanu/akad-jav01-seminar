package de.akad.jav01;

public enum Art { 
	Sieben (0),
	Acht (1),
	Neun (2),
	Zehn (3),
	Bube (4),
	Dame (5),
	Koenig (6),
	Ass (7);
	
	private int art;
	
	private Art(int art) {
		this.art = art;
	}
	
	public static Art get(int value) {
		
		for (Art a: Art.values()) {
			if (a.art == value) return a;
		}
		
        throw new IllegalArgumentException("Unknown value: " + value );
		
	}
	
	
}



