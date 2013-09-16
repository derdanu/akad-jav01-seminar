package de.akad.jav01;

public class Artikel 
{
	//	Attribute			
	private int nummer;
	private String bezeichnung;
	private double preis;

	//	Konstruktor
	public Artikel ( int nummer, String bezeichnung, double preis  )
	{
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;	
		this.preis = preis;
	}
	
	// weitere Methoden
	public int gibNummer ( )
	{
		return this.nummer;
	}
	
	public String gibBezeichnung ( )
	{	
		return this.bezeichnung;
	}
	
	public double getPreis ( )
	{
		return this.preis;
	}
	
	public String toString ( )
	{
		return "Artikelnummer : " + this.nummer + " Bezeichnung : " +
		                       this.bezeichnung  + " Preis: " + this.preis ;
	}
}