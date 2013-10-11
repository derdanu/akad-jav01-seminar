package de.akad.jav01;

public class Main {

	public static void main(String[] args) {

		double a,b;
		a = 25/4; // 6.0
		b = 25/4.0; // 6.25
		
		System.out.println(a + " " + b);
	
		String number = "12345";
		int num = Integer.parseInt(number);
		System.out.println(Integer.toString(num));
		
		
		Klasse c = new Klasse();
		try {
			
			c.ExceptionTester();
			
		} catch (DummyException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		s1.machWas();
		s2.machWas();
		s3.machWas();
		s1.machWas();

		GeomFigur figuren[] = new GeomFigur[2];
		figuren[0] = new Kreis(20, 30, 10);
		figuren[1] = new Rechteck(2, 78, 50, 50);
		
		for (GeomFigur f: figuren) {
			f.zeichnen();
			System.out.println("Flaeche: " + f.flaecheBerechnen() + " Umfang: " + f.umfangBerechnen());
		}
		
		
		Farbe f1 = Farbe.Gold;
		Farbe f2 = Farbe.Rot;

		System.out.println(f1);
		
		
	}
	
	
}
