import java.util.*;

import java.io.FileNotFoundException;

public class tryException {
	getMessage(String msg) {
        msg = "this is bound to execute";
        System.out.println(msg);
    }

	public static void main(String[] args) throws Exception {
		try {
			throw new FileNotFoundException();
		} catch (Exception e) {
			tryException te=new tryException("");
			System.out.println(te.getMessage());
		} finally {
			System.out.println("i will get printed");
		}

	}
}
