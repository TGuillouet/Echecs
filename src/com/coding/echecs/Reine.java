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
	List<Coordonnees> canMove(Coordonnees origin) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
		
		final int lastX = origin.getX() == 0 ? 0 : 7;
		final int lastY = origin.getY() == 0 ? 0 : 7;
	
		if (origin.getX() != lastX || origin.getY() != lastY) {
			
		}
		
		return result;
	}
}
