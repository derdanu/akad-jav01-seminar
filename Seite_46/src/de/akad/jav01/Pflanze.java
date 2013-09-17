package de.akad.jav01;

public class Pflanze <T> {

	private String name;
	private Bluetezeit bluetezeit;
	private T beschreibung;
	
	public Pflanze( String name, Bluetezeit bluetezeit, T beschreibung) {
		this.name = name;
		this.bluetezeit = bluetezeit;
		this.beschreibung = beschreibung;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(T beschreibung) {
		this.beschreibung = beschreibung;
	}
	
}
