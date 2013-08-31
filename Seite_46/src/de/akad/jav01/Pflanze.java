package de.akad.jav01;

public class Pflanze <T> {

	private String name;
	private T beschreibung;
	
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
