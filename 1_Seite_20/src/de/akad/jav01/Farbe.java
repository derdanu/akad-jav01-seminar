package de.akad.jav01;

public enum Farbe {
	
	GELB ("gelb"),
	ROT ("rot"),
	GRUEN ("gruen"),
	BLAU ("blau"),
	WEISS ("weis");

	private String farbe;
	
	private Farbe(String farbe) {
	
		this.farbe = farbe;
		
	}

	public static void gewinn(Farbe f) {
		
		switch (f) {
		
			case GELB:
				System.out.println("100");
				break;
			case ROT:
				System.out.println("1000");
				break;
			case GRUEN:
				System.out.println("5000");
				break;
			case BLAU:
				System.out.println("10000");
				break;
			case WEISS:
				System.out.println("kein Gewinn");
				break;
		}

			

	}
	
}
