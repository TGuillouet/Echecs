package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Reine extends Piece{
	
	public static Reine BLANC = new Reine(Couleur.BLANC);
	public static Reine NOIR = new Reine(Couleur.NOIR);
	
	protected Reine(Couleur pColor) {
		super(pColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Coordonnees> canMove(Coordonnees origin, Echiquier echiquier) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
		
		int i = 0;
		int n = 1;
		
		while (i <= 7 && n <= 8) {
			/* Déplacements correspondant a la tour */
			checkPosition(origin.getX() - i, origin.getY()	 , result);
			checkPosition(origin.getX() + i, origin.getY()    , result);
			checkPosition(origin.getX()    , origin.getY() - i, result);
			checkPosition(origin.getX()    , origin.getY() + i, result);
			/* Déplacements correspondant au fou */
			checkPosition(origin.getX() - n, origin.getY() + n, result);
			checkPosition(origin.getX() + n, origin.getY() - n, result);
			checkPosition(origin.getX() + n, origin.getY() + n, result);
			checkPosition(origin.getX() - n, origin.getY() - n, result);
			i++;
			n++;
		}
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if (isInside(x,y)) {
			result.add(new Coordonnees(x, y));
		}
	}
}
