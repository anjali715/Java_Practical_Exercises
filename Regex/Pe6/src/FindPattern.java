import java.util.regex.Pattern;
/*
 * Write a program to find out the multiple occurrences of the given 
 * word in a string using Matcher methods. 
 */
import java.util.Scanner;
import java.util.regex.Matcher;

public class FindPattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = scan.nextLine();

		System.out.println("Enter input : ");
		String patternString = scan.nextLine();

		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {

			System.out.println("Found at : " + matcher.start() + " - " + matcher.end());
		}
	}
}