package de.akad.jav01;

import java.util.List;
import java.util.ArrayList;;

public class Personalbestand {

	private static Personalbestand pb = null;
	
	public static Personalbestand getInstance() {
		if (pb == null) 
			pb = new Personalbestand();
		return pb;
	}
	
	private List<Person> personen = new ArrayList<Person>();
	
	public void addPerson(Person p) {
		this.personen.add(p);
	}
	
	public Person getPersion(String name) throws Exception {
		
		for (Person p: personen) {
			if (p.getName().equals(name)) return p;
		}
		
		throw new Exception("Name: " + name + " nicht gefunden");
	}
	
}
