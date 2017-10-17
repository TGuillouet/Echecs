package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Pion extends Piece{
	protected Pion(Couleur pColor) {
		super(pColor);
	}

	@Override
	List<Coordonnees> move(Coordonnees origin) {
		final List<Coordonnees> result = new ArrayList<>();
		
		final int lastY = getColor() == Couleur.BLANC ? 0 : 7 ; // Opérateur Ternaire
		
		if (origin.getY() != lastY) {
			if (getColor() == Couleur.BLANC) {
				result.add(new Coordonnees(origin.getX(), origin.getY() + 1)); // On récupère les coordonnées et on les modifie 
			} else if (getColor() == Couleur.NOIR) {
				result.add(new Coordonnees(origin.getX(), origin.getY() - 1)); // On récupère les coordonnées et on les modifie 
			}
		}
		
		return result;
	}
}
