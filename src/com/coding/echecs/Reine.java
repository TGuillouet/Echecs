package com.coding.echecs;

import java.util.ArrayList;
import java.util.List;

public class Reine extends Piece{
	protected Reine(Couleur pColor) {
		super(pColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	List<Coordonnees> move(Coordonnees origin) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
		
		final int lastX = origin.getX() == 0 ? 0 : 7;
		final int lastY = origin.getY() == 0 ? 0 : 7;
	
		if (origin.getX() != lastX || origin.getY() != lastY) {
			
		}
		
		return result;
	}
}
