import java.util.*;

/*
 * Write a program where an array of strings is input and output 
 * is a Map<String,boolean> where each different string is a key and its 
 * value is true if that string appears 2 or more times in the array
 */

public class ValueCount {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();

		String s = sc.nextLine();
		String[] names = new String[size];
		System.out.println("Enter " + size + " string values");

		for (int i = 0; i < size; i++) {

			names[i] = sc.nextLine();
		}
		Map<String, Boolean> frequency = new HashMap<>();
		int i = 0;
		while (i < size) {

			if (frequency.containsKey(names[i])) {
				frequency.put(names[i], true);
			} else
				frequency.put(names[i], false);
			i++;
		}

		Iterator<String> itr = frequency.keySet().iterator();
		while (itr.hasNext()) {
			String s1 = itr.next();
			System.out.println(s1 + ": " + frequency.get(s1));
		}
	}
}
