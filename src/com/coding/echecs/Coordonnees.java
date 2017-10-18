package com.coding.echecs;

public class Coordonnees {
	private int x;
	private int y;
	
	public Coordonnees (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Coordonnees) {
			final Coordonnees coords = (Coordonnees) obj;
			return (this.x == coords.x && this.y == coords.y); // Renvoi d'un booleen
		} else { return false; }
	}
}
