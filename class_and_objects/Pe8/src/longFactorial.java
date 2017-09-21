import java.util.*;

public class longFactorial {

	static long fact(int n) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
		
		for(int n=1;n<22;n++) {
		if (n <= 20) {
			System.out.println("The factorial of " + n + " is " + fact(n));
		} else {
			System.out.println("The factorial of " + n + " is out of range.");
		}
	}
	}

}