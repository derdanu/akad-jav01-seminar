package de.akad.jav01;

public class Account {
	// Attribute
	private int ktoNummer;
	private String name;
	private int guthaben;
	// Konstruktoren
	public Account ( ){ }
	public Account ( int ktoNummer, String name ) {
		this.ktoNummer = ktoNummer; this.name = name; this.guthaben = 1;
	}
	// weitere Methoden
	boolean kontoGleich ( int nr ) {
		return this.ktoNummer == nr ; 
	}
	
	public void setKtoNummer ( int ktoNummer ) {
		this.ktoNummer = ktoNummer;
	}
	
	public void setName ( String name ) {
		this.name = name; 
	}
	
	public void setGuthaben ( int guthaben ) {
		this.guthaben = guthaben; 
	}
	
	public int getKtoNummer ( ) {
		return this.ktoNummer;
	}
	
	public String getName ( ) {
		return this.name; 
	}
	
	public int getGuthaben ( ) {
		return this.guthaben;
	}
	
	public void abheben ( int betrag ) {
		this.guthaben = this.guthaben - betrag; 
	}
	
	public void einzahlen ( int betrag ) {
		this.guthaben = this.guthaben + betrag; 
	}
	
	public String toString ( ) {
		return this.ktoNummer + " Name: " + this.name + " Guthaben: " + this.guthaben ;
	} 
}