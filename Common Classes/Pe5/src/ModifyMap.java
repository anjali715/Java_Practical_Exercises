import java.util.*;

/*
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2. 
 * Modify and return the given map as follows: a. If the key `val1` has a value, set the key `val2` 
 * to have that value, and b. Set the key `val1` to have the value `"  "` (empty string). 
 */

public class ModifyMap {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in map:");
		int n = sc.nextInt();

		String s = sc.nextLine();
		System.out.println("Enter " + n + " string elements");
		for (int i = 1; i <= n; i++) {
			String value = sc.nextLine();
			String key = "val" + i;
			m.put(key, value);
		}

		System.out.println("Enter two key values whose value will be changed.");
		String k1 = sc.nextLine();
		String k2 = sc.nextLine();

		change(m, k1, k2);

	}

	static void change(Map<String, String> m, String k1, String k2) {

		if (m.containsKey(k1) && m.containsKey(k2)) {
			String temp = m.get(k1);
			String val = "";
			m.put(k1, val);
			m.put(k2, temp);
		}

		Iterator<String> itr = m.keySet().iterator();

		System.out.println("The Changed map elements:");
		while (itr.hasNext()) {
			String s1 = itr.next();
			if (s1.equals(k1) || s1.equals(k2))
				System.out.println(s1 + ": " + m.get(s1));
		}

	}

}
