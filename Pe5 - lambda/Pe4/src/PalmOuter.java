import java.util.*;

/*Create an interface named Hand with a method facepalm, and implement 
 * that interface by defining in an inner class named Palm within a method 
 * of the outer class, which returns a reference to your interface.*/

interface Hand {
	void facepalm();
}

public class PalmOuter {

	Hand dothis() {

		class Palm implements Hand {

			@Override
			public void facepalm() {
				// TODO Auto-generated method stub
				System.out.println("*facepalm*");
			}
		}

		Palm pp = new Palm();
		// pp.facepalm();
		return pp;

	}

	public static void main(String[] args) {
		PalmOuter po = new PalmOuter();
		Hand p = po.dothis();
		p.facepalm();
	}

}
