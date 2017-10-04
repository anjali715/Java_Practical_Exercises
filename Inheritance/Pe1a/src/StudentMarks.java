import java.util.*;

/*
the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.

*/

public class StudentMarks {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of students: ");
		int n = scan.nextInt();

		int arr[] = new int[n + 1];
		int i;

		System.out.println("Enter marks of students: ");

		try {
			for (i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
				if (0 <= arr[i] && arr[i] <= 100) {
					System.out.println("Marks are in the correct range.");
				} else {
					System.out.println("Marks are not in the correct range.");
				}

			}
		} finally {

			System.exit(0);
		}
		// catch(InputMismatchException ime) {
		// System.out.println("Input is not in the correct range.");
		//
		// }

	}

}
