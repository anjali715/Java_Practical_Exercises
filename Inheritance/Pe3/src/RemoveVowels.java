import java.util.*;

/*
 * Write a program to set up an array of places, Loop round and remove the vowels. Display the
new words in console
 */
public class RemoveVowels {

	public static void main(String[] args) {
		String places[] = new String[5];
		int i;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter places: ");

		for (i = 0; i < 5; i++) {
			places[i] = scan.nextLine();
		}

		for (i = 0; i < places.length; i++) {
			String str = places[i];
			str = str.replaceAll("[aeiou]", "");
			System.out.println(str);

		}
	}
}
