import java.util.*;

//Write a Java method to check if a given number is power of 4 

public class powerOf4 {

	public static boolean check(int n) {

		while (n > 0) {
			if (n % 4 == 0) {
				n = n / 4;
				if (n == 1)
					return true;
			} else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean flag = check(n);

		if (flag)
			System.out.println(n + " is a power of four.");
		else
			System.out.println(n + " is not a power of four.");

	}

}