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
		
		int n;
		
		for (n = 0; n <= 7; n++) {
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
		}
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result, Echiquier e) {
		if (isInside(x,y)) {
			result.add(new Coordonnees(x, y));
		}
	}
}
