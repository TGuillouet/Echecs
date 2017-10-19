package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Pion extends Piece{
	
	public static Pion BLANC = new Pion(Couleur.BLANC);
	public static Pion NOIR = new Pion(Couleur.NOIR);
	
	private Pion(Couleur pColor) {
		super(pColor);
	}

	@Override
	List<Coordonnees> canMove(int x, int y, Echiquier e) {
		final List<Coordonnees> result = new ArrayList<>();
		
		final int lastY = getColor() == Couleur.BLANC ? 0 : 7 ; // Opérateur Ternaire
		
		if (y != lastY) {
			if((getColor() == Couleur.BLANC) && y == 6){
				result.add(new Coordonnees(x, y - 2));
				result.add(new Coordonnees(x, y - 1));
			} else if (getColor() == Couleur.NOIR && y == 1) {
				result.add(new Coordonnees(x, y + 2));
				result.add(new Coordonnees(x, y + 1));
			} else if (getColor() == Couleur.BLANC) {
				result.add(new Coordonnees(x, y - 1)); // On récupère les coordonnées et on les modifie 
			} else if (getColor() == Couleur.NOIR) {
				result.add(new Coordonnees(x, y + 1)); // On récupère les coordonnées et on les modifie 
			} 
			/*if (e.isWhite == true) {
				if (isInside(x + 1, y - 1)){
					if (e.getPieceEn(x + 1, y - 1).getColor() == Couleur.NOIR) {
						result.add(new Coordonnees(x + 1, y - 1)); // On récupère les coordonnées et on les modifie 
					} 
				} else if (isInside(x - 1, y - 1)) {
					if (e.getPieceEn(x - 1, y - 1).getColor() == Couleur.NOIR ) {
						result.add(new Coordonnees(x - 1, y - 1)); // On récupère les coordonnées et on les modifie 
					}
				}
				
			} else {
				if (isInside(x + 1, y - 1)){
					if (e.getPieceEn(x + 1, y - 1).getColor() == Couleur.BLANC || e.getPieceEn(x + 1, y - 1) != null) {
						result.add(new Coordonnees(x + 1, y - 1)); // On récupère les coordonnées et on les modifie 
					} 
				} else if (isInside(x - 1, y - 1)) {
					if (e.getPieceEn(x - 1, y - 1).getColor() == Couleur.BLANC ) {
						result.add(new Coordonnees(x - 1, y - 1)); // On récupère les coordonnées et on les modifie 
					}
				}
				
			}*/
		}
		return result;
	}
}

