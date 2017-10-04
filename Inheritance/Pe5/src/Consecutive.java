import java.util.*;
/*
Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()
*/

public class Consecutive {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string of numbers: ");
		String input = scan.nextLine();
		boolean flag = false;
		int i;
		int arr[] = new int[7];

		String[] arrOfStr = input.split(",");
		// for (int i=0;i<7;i++)
		// System.out.println(arrOfStr[i]);

		for (i = 0; i < 7; i++) {
			arr[i] = Integer.parseInt(arrOfStr[i]);

		}

		for (i = 1; i < 7; i++) {

			if (arr[i] != (arr[i - 1] + 1)) {
				flag = true;
				break;
			}

		}

		if (flag == true)
			System.out.println(input + " are non consecutive numbers.");
		else
			System.out.println(input + " are consecutive numbers.");
	}

}
