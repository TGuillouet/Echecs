package com.coding.echecs;

public class Echiquier {
	private Piece echiquier[][] = new Piece[8][8]; // [y][x]
	
	public Echiquier (){
		init();
	}
	
	public void init () {
		for (int i = 0; i <= 7; i++) {
			echiquier[1][i] = Pion.NOIR;
			echiquier[6][i] = Pion.BLANC;
			
			echiquier[0][i] = Roi.NOIR;
			echiquier[7][i] = Roi.BLANC;
		}
	}
	
	public Piece getPieceCoord() {
		
	}
}
