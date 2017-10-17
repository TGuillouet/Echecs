package com.coding.echecs;

import java.util.List;

enum Couleur { NOIR, BLANC }

public abstract class Piece {
	/* Attributs */
	private final Couleur color;
		
	/* Signatures de méthodes */
	abstract List<Coordonnees> move(Coordonnees origin); // Liste avec une taille non fixe
	
	/* Constructeur */
	protected Piece (Couleur pColor) {
		this.color = pColor;
	}
	
	/* Méthodes */
	public boolean isInside (int x, int y) {		
		return ((x <= 7 && x >= 0) || (y <= 7 && y >= 0));
	}
	
	/* Getter */
	public Couleur getColor () {
		return this.color;
	}
}
