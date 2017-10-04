import java.util.*;

/*
 *  Write a Java program that accepts an array and converts it to an ArrayList 
 */

public class ArrayConvert {

	public static void main(String[] args)

	{
		System.out.println("Enter the number of students");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		String[] a = new String[size];

		String s = sc.nextLine();

		System.out.println("Enter student names:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextLine();
			// System.out.println(i);
		}

		ArrayList<String> arraylist = new ArrayList<String>();

		Collections.addAll(arraylist, a);

		for (String str : arraylist) {
			System.out.println(str);
		}

	}
}