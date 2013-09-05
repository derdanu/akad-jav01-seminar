package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datum date = new Datum();
		
		int tag = 24;
		int monat = 9;
		int jahr = 2013;
		
		date.setTag(tag);
		date.setMonat(monat);
		date.setJahr(jahr);
		
		System.out.println("Folgende Werte werden verwendet:");
		System.out.println("Tag: " + date.getTag());
		System.out.println("Monat: " + date.getMonat());
		System.out.println("Jahr: " + date.getJahr());
		System.out.println("---");
		System.out.println("getAnzahlTageProMonat(): " + date.getAnzahlTageProMonat());
		System.out.println("istSchaltjahr(): " + date.istSchaltjahr());
		System.out.println("getNaechstenMonat(): " + date.getNaechstenMonat());
		System.out.println("getNaechstenTag().toString(): " + date.getNaechstenTag()); //toString() wird direkt aufgerufen.

		date.datumUmwandeln(tag, monat);
		
		
	}

}
