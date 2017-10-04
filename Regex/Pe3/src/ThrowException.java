import java.io.FileNotFoundException;

/*
 * Create a class with a main( ) that throws an object of class Exception 
 * inside a try block. 
 * a. Give the constructor for Exception a String argument.  
 * b. Catch the exception inside a catch clause and print the String argument. 
 * c. Add a finally clause and print a message to prove you were there.
 */

public class ThrowException {
	void FirstException(String msg) {
		// msg = "This is bound to execute.";
		// System.out.println(msg);
	}

	public static void main(String[] args) throws Exception {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I was here.");
		}

	}
}