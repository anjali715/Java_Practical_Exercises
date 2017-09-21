import java.util.*;

public class grades {

	static float average(int[] a, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		float avg = (float) sum / n;
		return avg;
	}

	static int min(int[] a, int n) {
		int min = 101;
		for (int i = 0; i < n; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	static int max(int[] a, int n) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			try {
				array[i] = sc.nextInt();
			} catch (InputMismatchException obj) {
				System.out.println("ERROR: INPUT ENTERED IS NOT INTEGER. TERMINATING !");
			}
		}

		System.out.println("The average is:" + average(array, n));
		System.out.println("The min value is:" + min(array, n));
		System.out.println("The max value is:" + max(array, n));

	}

}
