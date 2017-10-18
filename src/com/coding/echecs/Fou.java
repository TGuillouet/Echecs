package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Fou extends Piece{
	protected Fou(Couleur pColor) {
		super(pColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Coordonnees> canMove(Coordonnees origin) {
		final List<Coordonnees> result = new ArrayList<>();
		
		int x = origin.getX(),
			y = origin.getY();
		
		while (isInside(x,y)) {
			
		}
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if (isInside(x,y)) {
			result.add(new Coordonnees(x, y));
		}
	}
}
