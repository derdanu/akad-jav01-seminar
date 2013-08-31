package de.akad.jav01;

public interface List<E> {
	
	/*
	fügt ein Element an der 1. Stelle ( = Position 0 ) der Liste ein,
	überschreibt nicht.
	Ist die Liste voll, Fehlermeldung: „Liste voll“
	*/
	public void insertFirst ( E element ) ;
	/*
	Hängt ein Element an das Ende der Liste an.
	Ist die Liste voll, Fehlermeldung: „Liste voll“
	*/
	public void insertLast ( E element );
	/*
	Entfernt das zuerst in die Liste eingefügte Element. Das ist das
	Element an Position 0. Ist die Liste leer, kann kein Element entfernt werden.
	Fehlermeldung
	*/
	public void leaveFirst ( );
	/*
	Entfernt das letzte Element der Liste.
	Ist die Liste leer, kann kein Element entfernt werden.
	Fehlermeldung
	*/
	public void leaveLast ( );
	/*
	Prüft, ob die Liste leer ist,
	*/
	public boolean isEmpty ( );
	/*
	fügt an der Stelle index das übergebene Element ein. Die Elemente ab der Position
	index werden nach rechts verschoben
	*/
	public void insertAt ( int index, E element );


}
