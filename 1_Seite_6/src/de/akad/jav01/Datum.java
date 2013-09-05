package de.akad.jav01;

public class Datum {

	private int tag;
	private int monat;
	private int jahr;
	
	public int getTag() {
		return tag;		
	}
	
	public int getMonat() {
		return monat;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public void setMonat(int monat) {
		this.monat = monat;
	}
	
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	public int getAnzahlTageProMonat() {

	
		if (this.monat % 2 == 0) {

			if (this.monat == 2) {
				if (istSchaltjahr()) {
					return 29;					
				} else 
					return 28;
			} else {
				if (this.monat > 7)	return 31; 
				else return 30;
			}
			
			
		} else {
			
			if (this.monat > 7) return 30;
			else return 31;
		}
		
	}
	
	public boolean istSchaltjahr() {
		
		if ((this.jahr % 400 == 0) || ((this.jahr % 4 == 0) && !(this.jahr % 100 == 0))) {
			return true;	
		}
		
		return false;
		
	}
	
	public int getNaechstenMonat() {
		
		if (this.monat < 12) return this.monat + 1;
		else return 1;
		
	}
	
	public Datum getNaechstenTag() {
		
		Datum date =  new Datum();
		
		if (getAnzahlTageProMonat() == this.tag) {
			date.tag = 1;
			date.monat = getNaechstenMonat();
		} else {
			date.tag = this.tag + 1;
			date.monat = this.monat;
		}
		
		
		if (date.monat == 1) date.jahr = this.jahr + 1;	
		else date.jahr = this.jahr;
		
		return date;
		
		
	}
	
	public String toString() {
		return this.tag + "." + this.monat + "." + this.jahr;
	}
	
	public void datumUmwandeln(int tag, int monat) {
		
		int cnt = 0, monat_tmp;
		
		monat_tmp = this.monat;
				
		for (int i=1; i<=monat; i++) {

			if (monat == i) cnt += tag;
			else {
				this.monat = i;
				cnt += getAnzahlTageProMonat();
			}
			
		}

		this.monat = monat_tmp;
		
		System.out.println("Datum::datumUmwandeln() ttt = " + cnt);
		
	}
	
}
