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
	List<Coordonnees> canMove(Coordonnees origin, Echiquier echiquier) {
		final List<Coordonnees> result = new ArrayList<>();
		
		int n = 1;
		while (n <= 7) {
			checkPosition(origin.getX() + n, origin.getY() - n, result);
			checkPosition(origin.getX() + n, origin.getY() + n, result);
			checkPosition(origin.getX() - n, origin.getY() - n, result);
			checkPosition(origin.getX() - n, origin.getY() + n, result);
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
