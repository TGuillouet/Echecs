package com.coding.echecs;

public class Main {
	public static void main(String [] args) {
		final Echiquier echiquier = new Echiquier();
		
		for (int y = 0; y <= 7; y++) {
			String line = "";
			for(int x = 0; x <= 7; x++) {
				final Piece piece = echiquier.getPieceEn(new Coordonnees(x, y));
				String representation = (piece == null) ? "--" : asString(piece);
				line += " " + representation;
			}
			System.out.println(line);
		}
	}
	
	private static String asString(Piece piece) {
		String p = "";
		String c = asString (piece.getColor()); 
		if (piece instanceof Pion) {
			p = "P";
		} else if (piece instanceof Roi) {
			p = "K";
		} else if (piece instanceof Cavalier) {
			p = "C";
		} else if (piece instanceof Reine) {
			p = "Q";
		} else if (piece instanceof Tour) {
			p = "T";
		} else if (piece instanceof Fou) {
			p = "F";
		} else {
			return null;
		}
		return p + c;
	}
	
	private static String asString(Couleur couleur) {
		return couleur == Couleur.BLANC ? "B" : "N";
	}
}
