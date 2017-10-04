import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

/*
 * Write a program with the implementation of Regular Expression 
 * to find the presence of the name Harry in a string.
 */
public class IsHarryPresent {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = scan.nextLine();

		System.out.println("Is Harry here ? " + input.matches(".*\\bharry\\b.*"));

	}

}
