import java.util.*;


public class factorial {
	
	public static int fact(int num)
    {
		if (num==1) return 1;
		else
			return num * fact(num - 1);
        
    }
	public static void main(String[] args)
	{
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter number: ");
//		int n = scan.nextInt();
		
		for (int n=1;n<14;n++)
		if(n<=12)
			System.out.println("The factorial of "+n+" is "+fact(n));	
		else
			System.out.println("The factorial of "+n+" is out of range");
	}

}
