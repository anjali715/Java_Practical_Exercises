import java.io.*;

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