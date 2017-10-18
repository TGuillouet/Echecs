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
			
			/* Initialisation des rois */
			echiquier[0][i] = Roi.NOIR;
			echiquier[7][i] = Roi.BLANC;
		}
	}
	
	public Piece getPieceEn(Coordonnees coord) {
		return echiquier[coord.getY()][coord.getX()]; // Retour de l'échiquier 
	}
	
	public boolean moveTo(Coordonnees origin, Coordonnees destination) {
		final Piece pieceABouger = getPieceEn(origin); // Récupération des coordonnées d'origine
		
		if (pieceABouger == null) { return false; }
		
		List<Coordonnees> deplacementsPossibles = pieceABouger.canMove(origin); // Stockage des différents coups possibles
		
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
