package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observer_DOS od = new Observer_DOS();
		Observer_View ov = new Observer_View();
		ov.setVisible(true);
		ov.pack();
		
		Personenregister p = new Personenregister();
		p.personAufnehmen("Daniel");
						
		Person per = p.getPersonAnPosition(0);
		per.addObserver(od);
		per.addObserver(ov);
		
		p.aendereNamen("Daniel", "Sepp");
		
		per.deleteObservers();
		
	}

}
