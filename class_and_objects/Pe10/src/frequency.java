import java.io.*;
import java.util.*;

class frequency {
	public static void main(String args[]) throws Exception {
		
		int ch,i=0;
		String str;
		str = "/home/anjali/example/abc.txt";
		
		HashMap map = new HashMap();
		HashSet set = new HashSet();
		
		FileInputStream fis = new FileInputStream(str);
		
		String string = new String();	
		
		while ((ch = fis.read()) != -1) {
			string += (char) ch;
		}
		
		StringTokenizer st = new StringTokenizer(string);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			map.put(i + "", s);
			set.add(s);
			i++;
		}
		
		System.out.println("Word Count:");
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
		System.out.println("Total no. of words in file: " + i);
	}
}
