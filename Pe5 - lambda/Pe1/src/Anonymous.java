import java.util.*;
/*
Create a class with a non-default constructor (one with arguments) and no 
default constructor (no "no-arg" constructor). Create a second class that has 
a method that returns a reference to an object of the first class.Create the 
object that you return by making an anonymous inner class that inherits from the 
first class
*/

class caller {
	int n;

	public caller(int n) {
		this.n = n;
	}

	public void exist() {
		System.out.println("Inside caller class");
	}
}

class create {
	public caller made() {
		caller obj = new caller(1) {
			public void exist() {
				System.out.println("The exist method has been over ridden.");
			}
		};
		return obj;
	}
}

public class Anonymous {
	public static void main(String[] args) {
		create ob = new create();
		caller obj2 = ob.made();
		System.out.println(obj2.n);
		obj2.exist();
	}

}
