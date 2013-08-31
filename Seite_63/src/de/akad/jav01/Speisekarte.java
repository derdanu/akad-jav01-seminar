package de.akad.jav01;

public enum Speisekarte {
	MONTAG ("Montag"),
	DIENSTAG ("Dienstag"),
	MITTWOCH ("Mittwoch"),
	DONNERSTAG ("Donnerstag"),
	FREITAG ("Freitag");
	
	private String tag;
	
	private Speisekarte(String tag) {
		this.tag = tag;
	}
	
	public String gibGericht() {
		
		String gericht = "";
		
		switch (this) { 
			case MONTAG:
				gericht = "Apfelstrudel";
				break;
			case DIENSTAG:
				gericht = "Schitzl";
				break;
			case MITTWOCH:
				gericht = "Schweiners";
				break;
			case DONNERSTAG:
				gericht = "Pizza";
				break;
			case FREITAG:
				gericht = "Spagetti";
				break;

		}
		
		return gericht;
	}
	
	public String toString() {
		return this.tag;		
	}
	

}
