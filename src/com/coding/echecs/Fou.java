package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Fou extends Piece{
	
	public static Fou BLANC = new Fou(Couleur.BLANC);
	public static Fou NOIR = new Fou(Couleur.NOIR);
	
	protected Fou(Couleur pColor) {
		super(pColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Coordonnees> canMove(int x, int y, Echiquier echiquier) {
		final List<Coordonnees> result = new ArrayList<>();
		
		int n;
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x + n, y - n, result, echiquier);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x + n, y + n, result, echiquier);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x - n, y - n, result, echiquier);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x - n, y + n, result, echiquier);
		}
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result, Echiquier e) {
		if (isInside(x,y)) {
			if(e.isWhite == true) {
				if ((e.getPieceEn(x, y) == null || e.getPieceEn(x, y).color == Couleur.NOIR))
					result.add(new Coordonnees(x, y));
			} else {
				if ((e.getPieceEn(x, y) == null || e.getPieceEn(x, y).color == Couleur.BLANC))
					result.add(new Coordonnees(x, y));
			}
		}
	}
}
