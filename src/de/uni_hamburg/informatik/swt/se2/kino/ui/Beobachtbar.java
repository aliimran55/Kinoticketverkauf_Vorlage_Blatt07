package de.uni_hamburg.informatik.swt.se2.kino.ui;

import java.util.HashSet;
import java.util.Set;

/**
 * Eine abstrakte Klasse, welches das Beobachter Muster erfuellt. Jede Klasse, die beobachtet werden will, muss von dieser Klasse erben. 
 */
public abstract class Beobachtbar
{
	private Set<Beobachter> _allebeobachter;
	
	
	/*
	 * Erzeugung der Klasse und initialisiert dabei eine Liste alle Beobachter. 
	 */
	public Beobachtbar()
	{
		_allebeobachter = new HashSet<Beobachter>();
	}
	
	/**
	 * Fügt einen Beobachter zur der Liste hinzu
	 * 
	 * @param beobachter der Beobachter, der hinzugefügt wird. 
	 * @require beobachter != null
	 */
	public void fuegeBeobachterHinzu(Beobachter beobachter)
	{
		assert beobachter != null: "Vorbedingung verletzt beobachter != null";
		_allebeobachter.add(beobachter);
	}
	
	/**
	 * Wenn eine Aenderung vorgenommen wurde, wird jeder Beobachter aus der Liste benachrichtigt
	 * 
	 * Ist protected da alle erbende Klasse das gleiche Verfahren benutzen.
	 * 
	 */
	protected void meldeAenderung()
	{
		for(Beobachter beobachter : _allebeobachter)
		{
			beobachter.beachteAenderung(this);
		}
	}
	
	/**
	 * Entfernt einen beobachter aus der Beobachterliste
	 * 
	 * @param beobachter der Beobachtrer, der entfernt wird
	 * @require beobachter != null
	 */
	public void entferneBeobachter(Beobachter beobachter)
	{
		assert beobachter != null: "Vorbedingung verletzt beobachter != null";
		_allebeobachter.remove(beobachter);
	}
}
