package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Person extends Observable {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, Observer o) {
		addObserver(o);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		setChanged();
		
		List<String> oldnew = new ArrayList<String>();
		oldnew.add(this.name);
		oldnew.add(name);
		this.name = name;
		notifyObservers(oldnew);
	}
	
	
	
}
