import java.util.Scanner;


/*Write a program to implement reverseSelector( ) which provides the 
 * following output 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 .
 */
interface Selector {
	void current(int c);
	void end(int e);
	void next(int n);

}

public class Sequence {
	

	class ReverseSequenceSelector implements Selector {
		public void current(int c) {
			if (c == 0)
				end(c);

			System.out.println(c);
			next(c - 1);
		}

		public void end(int e) {
			System.exit(0);
		}

		public void next(int n) {
			current(n);
		}
	}
	
	void Display(int size){
		
		//Sequence ss=new Sequence();
		 ReverseSequenceSelector rss= new ReverseSequenceSelector();
		 rss.current(size);

		 }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Sequence ss=new Sequence();
		ss.Display(size);
	}
}


 


