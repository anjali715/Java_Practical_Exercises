import java.util.*;

/*
 * Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WW represents white color and BB represents Black color.
 */

public class ChessBoard {

	public static void main(String[] args) {
		int row, col;

		for (row = 0; row < 8; row++) {
			for (col = 0; col < 8; col++) {
				if (row % 2 == col % 2)
					System.out.print("WW|");
				else
					System.out.print("BB|");

			}
			System.out.printf("%n");
		}
	}

}
