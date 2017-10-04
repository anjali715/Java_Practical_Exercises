
import java.util.*;

/*
 * Write a program to implement lambda expression which determines if one 
 * number is a factor of another along with the help of an interface with a 
 * method named test which accepts 2 integer
 */

interface Compute {
	void test(int n1, int n2);
}

public class Factor {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input=scan.nextLine();
		int n1=Integer.parseInt(input.split(",")[0]);
		int n2=Integer.parseInt(input.split(",")[1]);

		Compute cc = (int num1, int num2) -> {
			boolean flag = false;
			for (int x = 2; x < n1 / 2; x++)
				if (n1 % n2 == 0) {
					flag = true;
					break;
				}
			if (flag)
				System.out.println(n2 + " is a factor of " + n1);
			else
				System.out.println(n2 + " is not a factor of " + n1);
		};
		cc.test(n1, n2);
	}

}
