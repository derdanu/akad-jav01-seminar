package de.akad.jav01;

public class Brief implements Druckbar {

	private String text;
	
	public void ausgabe() {
		System.out.println("Text: " + this.text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
