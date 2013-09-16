package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Binaerzahl bin1 = new Binaerzahl("110");
		
		System.out.println("Zahl_1 binaer: " + bin1);
		System.out.println("Zahl_1 dezimal: " + bin1.getZahl());
				
		Binaerzahl bin2 = new Binaerzahl("111");
		
		System.out.println("Zahl_2 binaer: " + bin2);
		System.out.println("Zahl_2 dezimal: " + bin2.getZahl());
		
		Binaerzahl summe = bin1.addiere(bin2);
		
		System.out.println("Summe binaer: " + summe);
		System.out.println("Summe dezimal: " + summe.getZahl());

		Binaerzahl produkt = bin1.multipliziere(bin2);
		
		System.out.println("Produkt binaer: " + produkt);
		System.out.println("Produkt dezimal: " + produkt.getZahl());
		
		
		
		
	}

}
