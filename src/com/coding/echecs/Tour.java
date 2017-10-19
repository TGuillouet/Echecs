package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Tour extends Piece{
	
	public static Tour BLANC = new Tour(Couleur.BLANC);
	public static Tour NOIR = new Tour(Couleur.NOIR);
	
	protected Tour(Couleur pColor) {
		super(pColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Coordonnees> canMove(int x, int y, Echiquier echiquier) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
		
		int n;
		
		for (n = 0; n <= 7; n++) {
<<<<<<< HEAD
			checkPosition(x - n, y, result, echiquier);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(x + n, y, result, echiquier);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(x, y - n, result, echiquier);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(x, y + n, result, echiquier);
=======
			checkPosition(origin.getX() - n, origin.getY()	 , result, echiquier);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX() + n, origin.getY()    , result, echiquier);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX()    , origin.getY() - n, result, echiquier);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX()    , origin.getY() + n, result, echiquier);
>>>>>>> master
		}
		
		return result;
		
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result, Echiquier e) {
		if (isInside(x,y)) {
			if(Echiquier.isWhite == true) {
				if ( e.getPieceEn(x, y).getColor() == Couleur.NOIR)
				{
					result.add(new Coordonnees(x, y));
					System.out.println("Je suis là");
				}
			} else {
				if ((e.getPieceEn(x, y) == null || e.getPieceEn(x, y).getColor() == Couleur.BLANC))
					result.add(new Coordonnees(x, y));
			}
		}
	}
}
