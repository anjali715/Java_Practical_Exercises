import java.util.*;

/*
 * Write a program to assign a lambda expression to its functional interface. 
 * Then we execute the lambda expression by calling the method defined in the 
 * functional interface and pass in a parameter.  
 * */

interface Print {
	void printLength(String s);
}

public class WriteLambda {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		Print cc = (String s1) -> System.out.println(input.length()-1);
		cc.printLength(input);
	}

}
