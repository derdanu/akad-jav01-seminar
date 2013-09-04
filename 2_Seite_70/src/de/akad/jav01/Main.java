package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DosBox db = new DosBox();
		
		View view = new View();
		view.pack();
		view.setVisible(true);
		
		Person p1 = new Person("sepp");
		p1.addObserver(db);
		Person p2 = new Person("franz", db);
		Person p3 = new Person("erich", db);
		
		Personalbestand pb = Personalbestand.getInstance();
		pb.addPerson(p1);
		pb.addPerson(p2);
		pb.addPerson(p3);
		
		
		
	}

}
