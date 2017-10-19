package com.coding.echecs;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) throws IOException {
		
		Scanner key = new Scanner(System.in);
		
		final Echiquier echiquier = new Echiquier();
		
		echiquier.init();
		while (true) {
		if (echiquier.isWhite == true) {
			System.out.println("Au joueur blanc de jouer");
		} else if (echiquier.isWhite == false) {
			System.out.println("Au joueur noir de jouer");
		}
		for (int y = 0; y <= 7; y++) {
			String line = "";
			for(int x = 0; x <= 7; x++) {
				final Piece piece = echiquier.getPieceEn(x, y);
				String representation = (piece == null) ? "♢" : asString(piece);
				line += " " + representation;
			}
			System.out.println(y + " |" + line);
		}
		System.out.println("  -----------------------");
		System.out.println("    0  1  2  3  4  5  6  7 ");
		
		System.out.print("Entrez l'abscisse de votre pion : ");
		int posX = key.nextInt();
		System.out.print("Entrez l'ordonnée de votre pion : ");
		int posY = key.nextInt();
		System.out.print("Entrez le déplacement en abscisse : ");
		int fPosX = key.nextInt();
		System.out.print("Entrez le déplacement en ordonnée : ");
		int fPosY = key.nextInt(); 
		
		Coordonnees dest = new Coordonnees(fPosX, fPosY);
		
		echiquier.moveTo(posX, posY, dest, echiquier);
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		}
}
	
	private static String asString(Piece piece) {
		String p = "";
		if (piece instanceof Pion) {
			if (piece.color == Couleur.BLANC)
				p = "♟";
			else
				p = "♙";
		} else if (piece instanceof Roi) {
			if (piece.color == Couleur.BLANC)
				p = "♚";
			else
				p = "♔";
		} else if (piece instanceof Cavalier) {
			if (piece.color == Couleur.BLANC)
				p = "♞";
			else
				p = "♘";
		} else if (piece instanceof Reine) {
			if (piece.color == Couleur.BLANC)
				p = "♛";
			else
				p = "♕";
		} else if (piece instanceof Tour) {
			if (piece.color == Couleur.BLANC)
				p = "♜";
			else
				p = "♖";
		} else if (piece instanceof Fou) {
			if (piece.color == Couleur.BLANC)
				p = "♝";
			else
				p = "♗";
		} else {
			return null;
		}
		return p;
	}
}
