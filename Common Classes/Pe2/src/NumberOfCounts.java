import java.io.*;
import java.util.*;

/*
 * Write a program to find the number of counts in the following String. 
 * Store the output in Map<String,Integer> as key value pair.
 */

class NumberOfCounts {
	public static void main(String args[]) throws Exception {

		int ch, i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();

		String replaceString = str.replaceAll("[!@#$%^&*()-__=+]", " ");
		// System.out.println(replaceString);

		HashMap map = new HashMap();
		HashSet set = new HashSet();

		StringTokenizer st = new StringTokenizer(replaceString);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			map.put(i + "", s);
			set.add(s);
			i++;
		}

		// System.out.println("Word Count:");
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String str1;
			int count = 0;
			str1 = (String) iter.next();
			for (int j = 0; j < i; j++) {
				String str2;
				str2 = (String) map.get(j + "");
				if (str1.equals(str2))
					count++;
			}
			System.out.println(str1 + ": " + count);
		}
	}
}