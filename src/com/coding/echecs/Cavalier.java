package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Cavalier extends Piece{
	public static Cavalier BLANC = new Cavalier(Couleur.BLANC);
	public static Cavalier NOIR = new Cavalier(Couleur.NOIR);
	
	protected Cavalier(Couleur pColor) {
		super(pColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Coordonnees> canMove(Coordonnees origin, Echiquier echiquier) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
		
		checkPosition(origin.getX() - 1, origin.getY() - 2, result);
		checkPosition(origin.getX() + 1, origin.getY() - 2, result);
		checkPosition(origin.getX() - 1, origin.getY() + 2, result);
		checkPosition(origin.getX() + 1, origin.getY() + 2, result);
		checkPosition(origin.getX() - 2, origin.getY() - 1, result);
		checkPosition(origin.getX() - 2, origin.getY() + 1, result);
		checkPosition(origin.getX() + 2, origin.getY() - 1, result);
		checkPosition(origin.getX() + 2, origin.getY() + 1, result);
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if (isInside(x,y)) {
			result.add(new Coordonnees(x, y));
		}
	}
}
