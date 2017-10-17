package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;


public class Roi extends Piece{
	protected Roi(Couleur pColor) {
		super(pColor);
	}

	@Override
	List<Coordonnees> move(Coordonnees origin) {
		final List<Coordonnees> result = new ArrayList<>();
		
		checkPosition(origin.getX() - 1, origin.getY() - 1, result);
		checkPosition(origin.getX() - 1, origin.getY()    , result);
		checkPosition(origin.getX() - 1, origin.getY() + 1, result);
		checkPosition(origin.getX()    , origin.getY() - 1, result);
		checkPosition(origin.getX()    , origin.getY() + 1, result);
		checkPosition(origin.getX() + 1, origin.getY() - 1, result);
		checkPosition(origin.getX() + 1, origin.getY()    , result);
		checkPosition(origin.getX() + 1, origin.getY() + 1, result);
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if (isInside(x,y)) {
			result.add(new Coordonnees(x, y));
		}
	}
}
