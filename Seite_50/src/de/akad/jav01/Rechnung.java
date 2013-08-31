package de.akad.jav01;

public class Rechnung implements Druckbar {

	private String name;
	private double summe;
	private Datum datum;
	private Anschrift anschrift;
	
	public void ausgabe() {
		System.out.println("Name: " + this.name + "; Summe: " + this.summe + "; Datum:" + this.datum.toString() + "; Anschrift: " + this.anschrift.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSumme() {
		return summe;
	}

	public void setSumme(double summe) {
		this.summe = summe;
	}

	public Datum getDatum() {
		return datum;
	}

	public void setDatum(Datum datum) {
		this.datum = datum;
	}

	public Anschrift getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(Anschrift anschrift) {
		this.anschrift = anschrift;
	}
	
	

}
