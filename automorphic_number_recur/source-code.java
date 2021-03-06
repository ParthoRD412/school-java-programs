import java.util.*; // importing all the classes of the util package
public class Automorphic // class name declaration
{
	static boolean isAutomorphic(int n, int s) // this is a static method to check a  number is automorphic or not using recursion
	{
	    if(n>0)
	    {
			if(n%10 != s%10)
				return false;
	        else
				return isAutomorphic(n/10, s/10); // promotion of recursion by calling the recursive method here!
	    }
		else
			return true;
	}

	public static void main(String[] args)  // running the main function
	{
        Scanner in=new Scanner(System.in); // creation of the scanner class object
	    System.out.println("Enter a number: ");
	    int n = in.nextInt(); // taking input
	    if(isAutomorphic(n, n*n)==true) // checking whether the number is an armstrong number using a recursive method
	    	System.out.println("It is an Automorphic Number.");
	    else
	    	System.out.println("It is not an Automorphic Number.");
	}
}
