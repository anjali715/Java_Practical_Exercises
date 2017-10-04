import java.io.*;

/*
 *  Write a program to read the content of a text file, convert the content in upper case and print.
the same in console along with the length of the file. 
*/

public class FileRead {
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("/home//anjali/example/abc.txt");

		int i;
		int length = 0;
		while ((i = fr.read()) != -1) {

			char c = (char) i;
			char x = Character.toUpperCase(c);
			System.out.print(x);
			length++;

		}
		System.out.println("");
		System.out.print("The file contains " + length + " characters.");
	}
}
