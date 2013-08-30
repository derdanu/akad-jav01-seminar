package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anschrift a = new Anschrift();
		a.setOrt("Musterhausen");
		a.setStrasse("Musterstr.");
		
		Datum d = new Datum();
		d.setTag(1);
		d.setMonat(5);
		d.setJahr(2004);
		
		Rechnung r = new Rechnung(d, a);
		r.setNummer(1);
		r.setName("Rechnungsname");
		r.setSumme(1000);
		
		System.out.println(r.toString());
		
	}

}
