package de.uni_hamburg.informatik.swt.se2.kino.ui;

/**
 * Ein Beobachter als Interface, welches zum Beobachter Muster gehört. Die Klasse wird von KassenController implementiert.
 * Jede Klasse, die beobachten will, muss dieses Interface implementieren.  
 * 
 * @author 
 * @version 2025
 */
public interface Beobachter
{
	/**
	 * Wenn eine Aenderung vorgenommen wird, soll darauf reagiert werden.
	 * Die Aenderungen werden in den Subwerkzeugen gemacht. 
	 * 
	 * @param beobachtetesObjekt
	 */
	 public void beachteAenderung(Beobachtbar beobachtetesObjekt);
}
