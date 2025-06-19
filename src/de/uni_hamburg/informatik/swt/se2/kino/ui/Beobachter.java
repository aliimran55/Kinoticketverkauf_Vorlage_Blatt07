package de.uni_hamburg.informatik.swt.se2.kino.ui;

public interface Beobachter
{
	/**
	 * Wenn eine Aenderung vorgenommen wird, soll darauf reagiert werden.
	 * Die Aenderungen werden in den Subwerkzeugen gemacht. 
	 */
	 public void beachteAenderung();
}
