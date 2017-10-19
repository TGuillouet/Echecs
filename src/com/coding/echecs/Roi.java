package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;


public class Roi extends Piece{
	
	public static Roi BLANC = new Roi(Couleur.BLANC);
	public static Roi NOIR = new Roi(Couleur.NOIR);
	
	private Roi(Couleur pColor) {
		super(pColor);
	}

	@Override
	List<Coordonnees> canMove(int x, int y, Echiquier echiquier) {
		final List<Coordonnees> result = new ArrayList<>();
		
		checkPosition(x - 1, y - 1, result);
		checkPosition(x - 1, y    , result);
		checkPosition(x - 1, y + 1, result);
		checkPosition(x    , y - 1, result);
		checkPosition(x    , y + 1, result);
		checkPosition(x + 1, y - 1, result);
		checkPosition(x + 1, y    , result);
		checkPosition(x + 1, y + 1, result);
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if (isInside(x,y)) {
			result.add(new Coordonnees(x, y));
		}
	}
}
