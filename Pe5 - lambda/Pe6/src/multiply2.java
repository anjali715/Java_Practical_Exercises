import java.util.*;

/*
Write a program to create interface with single method and use it as lambda expression to multiply the given value by 2. When creating the lambda expression we declare the type of the parameter s1 to have the Integer type.  
*/

interface compute {
	void computeMethod(int x);
}

public class multiply2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		compute cc = (int x1) -> System.out.println(2 * x1);
		cc.computeMethod(x);
	}

}
