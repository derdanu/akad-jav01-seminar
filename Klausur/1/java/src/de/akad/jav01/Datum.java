package de.akad.jav01;

public class Datum {

	private int tag;
	private int monat;
	private int jahr;
	
	public Datum(int tag, int monat, int jahr) throws InvalidDateArgumentsException {
		
		if (istKorrekt(tag, monat, jahr)) {
			
			this.tag = tag;
			this.monat = monat;
			this.jahr = jahr;
			
		} else {
			throw new InvalidDateArgumentsException("Fehlerhaftes Datum");			
		}
				
	}
	
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public void setMonat(int monat) {
		this.monat = monat;
	}
	
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	private boolean istKorrekt (int tag, int monat, int jahr ) {
		
		if (tag > gibAnzahlTageProMonat(monat)) return false;
		if (jahr == 0 || jahr > 2200) return false;
	
		
		return true;
	}
	
	public Datum gibNaechstenTag() throws InvalidDateArgumentsException {
		
		int tag, monat, jahr;

		monat = this.monat;
		jahr = this.jahr;
		
		if (this.tag == this.gibAnzahlTageProMonat(this.monat)) {
			tag = 1;
			monat = this.gibNaechstenMonat();
			if (monat == 1) jahr = this.jahr + 1;
		}
		else {
			tag = this.tag + 1;
		}
		
		return new Datum(tag, monat, jahr);
				
	}
	
	private boolean istSchaltjahr(int jahr) {
		
		if (jahr % 400 == 0) return true;
		
		if (jahr % 4 == 0 && jahr % 100 != 0) {
			
			return true;
		}
		
		return false;
		
		
	}
	
	private int gibAnzahlTageProMonat(int monat) {
		
		switch (monat) {
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return (istSchaltjahr(this.jahr)) ? 29 : 28; 
				
		
		}
		
		return 0;
		
	}
	
	private int gibNaechstenMonat() {
		
		return (this.monat == 12) ? 1 : this.monat + 1;
		
	}
	
	public String toString() {
		
		return this.tag + "." + this.monat + "." + this.jahr;
				
	}
	
	public class InvalidDateArgumentsException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InvalidDateArgumentsException() {
			super();
		}
		
		public InvalidDateArgumentsException(String s) {
			super(s);
		}
		
		@Override
		public String getMessage() {
			return "InvalidDateArgumentsException: " + super.getMessage();				
		}
		
	}

	
}
