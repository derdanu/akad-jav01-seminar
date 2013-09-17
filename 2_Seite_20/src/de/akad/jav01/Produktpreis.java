package de.akad.jav01;

public enum Produktpreis {
	
	LOW (9.99),
	MEDIUM (19.99),
	HIGH (49.99),
	EXCLUSIVE (99.00);
	
	private double preis;
	
	private Produktpreis(double preis) {
		
		this.preis = preis;
		
	}
	
	public String toString() {
		
		return String.valueOf(get(this));
		
	}
	
	public static double get(Produktpreis f) {
		
		double preis = 0;
		
		switch (f) {
			case LOW:
				preis = 9.99;
				break;
			case MEDIUM:
				preis = 19.99;
				break;
			case HIGH:
				preis = 49.99;
				break;
			case EXCLUSIVE:
				preis = 99.99;
				break;
					
		}
		
		return preis;
		
	}
	
	public static void alleAnzeigen() {
		
		for (Produktpreis p: Produktpreis.values()) {
			
			System.out.println(p);
			
		}
	}

}
