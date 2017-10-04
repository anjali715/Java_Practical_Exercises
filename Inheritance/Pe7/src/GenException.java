import java.util.*;

/*
 * Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.ete
 */

public class GenException {

	public static void main(String args[]) {
		int result = 0;
		int arraySize = 3;
		int negSize = -1;
		int[] array = null;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice: ");
		int choice = scan.nextInt();

		try {
			switch (choice) {
			case 0:
				result = array[0];
				break;
			case 1:
				array = new int[negSize];
				break;
			case 2:
				array = new int[arraySize];
				result = array[arraySize];
				break;
			}

		} catch (NullPointerException e) {
			System.out.println("\nNullPointerException Exception caught.\n " + "Message in NullPointerException is:\n"
					+ "\n" + e + "\n");

		} catch (NegativeArraySizeException e) {
			System.out.println("\nNegativeArraySizeException Exception caught.\n "
					+ "Message in NegativeArraySizeException is:\n" + "\n" + e + "\n");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nArrayIndexOutOfBoundsException Exception caught.\n "
					+ "Message in ArrayIndexOutOfBoundsException is:\n" + "\n" + e + "\n");

		}
	}
}
