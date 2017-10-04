import java.util.*;
import java.text.*;


/*
 * Write a java program to calculate first and last date of a week.
 */

public class DaysOfWeek {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println("First Date of Week: " + df.format(c.getTime()));
		for (int i = 0; i < 6; i++) {
			c.add(Calendar.DATE, 1);
		}

		System.out.println("Last Date of Week: " + df.format(c.getTime()));

	}
}
