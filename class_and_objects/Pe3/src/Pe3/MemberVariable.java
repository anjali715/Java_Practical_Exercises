package Pe3;

import java.util.*;

/*
 *  Create a class named Member with Name, age, Salary as its variable, write an other class
named Member Variable that creates an instance of the Member class, initialises its member
variables, and then displays the value of each member variable. 
 */

class Member {
	String name;
	int age;
	int salary;

}

public class MemberVariable {
	public static void main(String[] args) {
		Member m = new Member();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = scan.nextLine();

		System.out.println("Enter age: ");
		int age = scan.nextInt();

		System.out.println("Enter salary: ");
		int sal = scan.nextInt();

		m.name = name;
		m.age = age;
		m.salary = sal;

		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Salary: " + m.salary);
	}

}
