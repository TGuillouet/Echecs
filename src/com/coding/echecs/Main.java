package com.coding.echecs;

public class Main {

	public static void main(String [] args) {
		
		String echiquier[][] = new String[8][8];
		int x = 0;
		int y = 0;
		final int max = 7;
		
		/* Echiquier */
		for(y = 0; y <= max; y++) {
			for(x = 0; x <= max; x++) {
				if ((x == 0 && y == 0)  || (x == max && y == 0) || (x == max && y == max)  || (x == 0 && y == max)) {
					echiquier[x][y] = "Tour";
					System.out.print(echiquier[x][y] + " ");
				} else if ((x == 1 && y == 0) || (x == (max - 1) && y == 0) || (x == 1 && y == max) || (x == (max-1) && y == max)) {
					echiquier[x][y] = "Cavalier";
					System.out.print(echiquier[x][y] + " ");
				} else if ((x == 2 && y == 0) || (x == (max-2) && y == 0) || (x == 2 && y == max) || (x == (max-2) && y == max)) {
					echiquier[x][y] = "Fou ";
					System.out.print(echiquier[x][y]);
				} else if ((x == 3 && y == 0) || (x == 4 && y == max) ) {
					echiquier[x][y] = "Reine ";
					System.out.print(echiquier[x][y]);
				} else if ((x == 4 && y == 0) || (x == 3 && y == max) ) {
					echiquier[x][y] = "Roi ";
					System.out.print(echiquier[x][y]);
				} else if ((y == 1) || (y == (max - 1))) {
					echiquier[x][y] = "Pion ";
					System.out.print(echiquier[x][y]);
				} else {
					echiquier[x][y] = "VIDE ";
					System.out.print(echiquier[x][y]);
				}
				if (x == max) {
					System.out.print("\n");
				}
			}
		}
	}
}
