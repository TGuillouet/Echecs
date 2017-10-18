package com.coding.echecs;

import java.util.List;

public class Echiquier {
	private Piece echiquier[][] = new Piece[8][8]; // [y][x]
	
	public Echiquier (){
		init();
	}
	
	public void init () {
		for (int i = 0; i <= 7; i++) {
			
			/* Initialisation des pions */
			echiquier[1][i] = Pion.NOIR;
			echiquier[6][i] = Pion.BLANC;
			
			/* Placement des tours */
			if (i == 0 || i == 7) {
				echiquier[0][i] = Tour.NOIR;
				echiquier[7][i] = Tour.BLANC;
			}
			
			/* Placement des cavaliers */
			if (i == 1 || i == 6) {
				echiquier[0][i] = Cavalier.NOIR;
				echiquier[7][i] = Cavalier.BLANC;
			}
			
			/* Placement des fous */
			if (i == 2 || i == 5) {
				echiquier[0][i] = Fou.NOIR;
				echiquier[7][i] = Fou.BLANC;
			}
			
			/* Placement des rois et reines*/
			if (i == 3 || i == 4) {
				if (i == 3) {	
					echiquier[0][i] = Roi.NOIR; 
					echiquier[0][i + 1] = Reine.NOIR; 
				} else if (i == 4) {
					echiquier[7][i] = Roi.BLANC;
					echiquier[7][i - 1] = Reine.BLANC;
				}
			}
		}
	}
	
	public Piece getPieceEn(Coordonnees coord) {
		return echiquier[coord.getY()][coord.getX()]; // Retour de l'échiquier 
	}
	
	public boolean moveTo(Coordonnees origin, Coordonnees destination) {
		final Piece pieceABouger = getPieceEn(origin); // Récupération des coordonnées d'origine
		final Echiquier e = new Echiquier();
		
		if (pieceABouger == null) { return false; }
		
		List<Coordonnees> deplacementsPossibles = pieceABouger.canMove(origin, e); // Stockage des différents coups possibles
		
		// for (int i ; i <= deplacementsPossibles.size(); i++) { Coordonnees actual = deplacementsPossibles.get(i); ... }
		for (Coordonnees actual : deplacementsPossibles) {
			if(actual.equals(destination)) {
				// Le déplacement est valide
				//echiquier[destination.getY()][destination.getX()] = echiquier[origin.getY()][origin.getX()]; // Moins optimisé
				echiquier[destination.getY()][destination.getX()] = pieceABouger; // Remplacement des coordonnees de la pièce
				echiquier[origin.getY()][origin.getX()] = null; // On vide la cese d'origine de la pièce
				return true;
			}
		}
		return false;
	}
}
