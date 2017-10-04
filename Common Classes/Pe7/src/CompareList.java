import java.util.*;

/*
 *  Complete the following program that compares two ArrayList objects. 
 *  The program should take an element of the first ArrayList and check 
 *  whether the element is present in the second ArrayList. 
 *  The program should then store the comparison results in a separate 
 *  ArrayList object as either "Yes" or "No" values. 
 */

public class CompareList {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Java");
		c1.add("C");
		c1.add("C++");
		c1.add("Python");
		c1.add("JavaScript");

		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Java");
		c2.add("Angular");
		c2.add("C++");
		c2.add("JavaScript");

		ArrayList<String> Answer = new ArrayList<String>();
		int flag = 0;
		for (int i = 0; i < c1.size(); i++) {
			flag = 0;
			String s1 = c1.get(i);
			for (int j = 0; j < c2.size(); j++) {
				String s2 = c2.get(j);
				if (s2.equals(s1)) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				Answer.add("Yes");
			else
				Answer.add("No");
		}

		for (String temp : Answer) {
			System.out.println(temp);
		}
	}
}