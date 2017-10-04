import java.util.*;

/*
Write a class named Outer that contains an inner class named Inner. 
Add a method to Outer that returns an object of type Inner. 
In main( ), create and initialize a reference to an Inner
*/

public class TryInner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String nn = sc.nextLine();
		System.out.println("Enter age:");
		int mm = sc.nextInt();

		Inner obj = create(nn, mm);
		System.out.println("Name:" + obj.name);
		System.out.println("Age:" + obj.age);

	}

	static class Inner {

		String name = null;
		int age;

		public Inner(String n, int m) {
			this.name = n;
			this.age = m;
		}

	}

	public static Inner create(String n, int m) {
		return new Inner(n, m);
	}
}
