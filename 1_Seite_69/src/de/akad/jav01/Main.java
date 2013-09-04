package de.akad.jav01;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dosbox dox_box = new Dosbox();
		View view = new View();
		view.pack();
		view.setVisible(true);

		Artikel artikel = new Artikel ( 1234, "Lampe", 8, 5 );
		artikel.addObserver(dox_box);
		artikel.addObserver(view);
		
		for (int i=0; i<4; i++) {
			try {
				artikel.aendereBestand(1);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
