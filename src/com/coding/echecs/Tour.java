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
	List<Coordonnees> canMove(Coordonnees origin, Echiquier echiquier) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
		
		int n = 0;
		
		while (n <= 7) {
			checkPosition(origin.getX() - n, origin.getY()	 , result);
			checkPosition(origin.getX() + n, origin.getY()    , result);
			checkPosition(origin.getX()    , origin.getY() - n, result);
			checkPosition(origin.getX()    , origin.getY() + n, result);
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
