import java.util.*;

//Write a Java method to Reverse the given input & Check if it is a Palindrome.

public class palindrome {

	public static void checkPal(String orig) {

		String reverse = "";
		for (int i = orig.length() - 1; i >= 0; i--)
			reverse = reverse + orig.charAt(i);

		if (reverse.equals(orig))
			System.out.println(orig + " is a palindrome.");
		else
			System.out.println(orig + " is not a palindrome.");

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String n = scan.nextLine();

		checkPal(n);

	}
}