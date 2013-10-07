package de.akad.jav01;

import java.util.ArrayList;
import java.util.List;

public class Personenregister {

	private List<Person> Personenregister = new ArrayList<Person>();
	private int anzahlAenderungen = 0;
	
	public void personAufnehmen(String name) {
		
		this.Personenregister.add(new Person(name));
		
	}
	
	public void aendereNamen(String alterName, String neuerName) {
		
		for (Person p: Personenregister) {
			
			if (p.getName().equals(alterName)) {
				p.aendereName(neuerName);
				this.anzahlAenderungen++;
			}
			
		}
		
	}
	
	public int getAnzahlPersonenImRegister() {
		return Personenregister.size();
	}

	/**
	 * @param pos Position der Person Start bei 0
	 * @return Person
	 */
	public Person getPersonAnPosition(int pos) {

		return Personenregister.get(pos);
	}
	
	public int getAnzahlGeaenderteNamen() {
		return this.anzahlAenderungen;
		
	}
	
	public int getPersonAnPosition() {
		// Was soll das?
		return 0;		
	}
	
}
