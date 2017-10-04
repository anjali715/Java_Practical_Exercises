import java.util.*;

/* 
 * Write a program to compute the addition of two matrix, Read the number of rows and columns as
input, also the values of each matrix
 */

public class AddMatrices {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int row = scan.nextInt();

		System.out.println("Enter no. of columns: ");
		int col = scan.nextInt();

		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int i, j;

		System.out.println("Enter elements of first matrix: ");
		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				a[i][j] = scan.nextInt();

		System.out.println("Enter elements of second matrix: ");
		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				b[i][j] = scan.nextInt();

		System.out.println("The sum of the two matrices: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				System.out.print(a[i][j] + b[i][j] + " ");
			System.out.printf("%n");
		}

	}

}
