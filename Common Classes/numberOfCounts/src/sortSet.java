import java.util.*;

public class sortSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string of names: ");
		String input=scan.nextLine();
		
		StringTokenizer st=new StringTokenizer(input);
		
		while(st.hasMoreTokens())
			set.add(st.nextToken());

//		 System.out.println(set);
		int count = set.size();
		
		TreeSet sortedSet = new TreeSet<String>(set);
        System.out.println("Sorted Set : ");
        System.out.println(sortedSet);
        
        List<String> list = new ArrayList<String>(count);
        list.addAll(sortedSet);
        
        System.out.println("Array list from Set : ");
        System.out.println(list);

	}

}
