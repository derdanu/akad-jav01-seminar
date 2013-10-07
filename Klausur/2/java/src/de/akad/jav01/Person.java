package de.akad.jav01;

import java.util.Observable;

public class Person extends Observable {

	private String name;
	
	public Person() {};
	
	public Person(String name) {
		this.name = name;
	}
	
	
	public void aendereName(String neuerName) {
		String alterName = this.name;
		this.name = neuerName;
		this.setChanged();
		this.notifyObservers(alterName);
	}
	
	public String getName() {
		return this.name;
	}
	
}
