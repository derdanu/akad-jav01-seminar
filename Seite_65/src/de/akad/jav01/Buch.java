package de.akad.jav01;

public class Buch {

	private String titel;
	private int istAusgeliehen = 0; // 0=nein, 1=ja
	
	public int istbuchAusgeliehen() {
		return this.istAusgeliehen;
	}
	
	public void buchAusleihen() throws Exception {
		
		if (this.istbuchAusgeliehen() == 1) throw new Exception(this.getTitel() + " ist schon ausgeliehen");
		else this.istAusgeliehen = 1;
		
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
	
}
