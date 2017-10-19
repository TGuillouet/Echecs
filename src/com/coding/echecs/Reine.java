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
	List<Coordonnees> canMove(int x, int y, Echiquier echiquier) {
		final ArrayList<Coordonnees> result = new ArrayList<>();
			
		int n;
		
<<<<<<< HEAD
		for (n = 0; n <= 7; n++) {
			checkPosition(x - n, y	 , result);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(x + n, y    , result);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(x    , y - n, result);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(x , y + n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x + n, y - n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x + n, y + n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x - n, y - n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(x - n, y + n, result);
=======
		int n;
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX() - n, origin.getY()	 , result);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX() + n, origin.getY()    , result);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX()    , origin.getY() - n, result);
		}
		
		for (n = 0; n <= 7; n++) {
			checkPosition(origin.getX()    , origin.getY() + n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(origin.getX() + n, origin.getY() - n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(origin.getX() + n, origin.getY() + n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(origin.getX() - n, origin.getY() - n, result);
		}
		
		for (n = 1; n <= 7; n++) {
			checkPosition(origin.getX() - n, origin.getY() + n, result);
>>>>>>> master
		}
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if (isInside(x,y)) {
			
			result.add(new Coordonnees(x, y));
		}
	}
}
