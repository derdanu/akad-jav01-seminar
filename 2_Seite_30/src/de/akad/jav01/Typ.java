package de.akad.jav01;

public enum Typ { 
	Herz (0), 
	Kreuz (1), 
	Pic (2), 
	Karo (3);

	private int typ;
	
	private Typ(int typ) {
		this.typ = typ;
	}
	
	public static Typ get(int value) {
		
		for (Typ a: Typ.values()) {
			if (a.typ == value) return a;
		}
		
        throw new IllegalArgumentException("Unknown value: " + value );
		
	}
}

