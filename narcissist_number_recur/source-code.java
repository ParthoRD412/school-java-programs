import java.util.*; // importing all the classes of the util package
public class narcissist // class name declaration
{
	int digi_sum_power(int n, int a) // this method is find the sum of the digits of a number raised to the number of digits recursively
	{
		return (n==0)? 0 : (int)Math.pow(n%10,a) + digi_sum_power(n/10,a);
	}

	public static void main(String args[]) // running the main() method
	{
		Scanner in = new Scanner(System.in); // Scanner class object creation
		narcissist ob = new narcissist(); // clas object creation
		System.out.println("Enter a number : ");
		int n = in.nextInt(); // taking a number input
		System.out.println((ob.digi_sum_power(n,(n+"").length()) == n)? "Narcissist number" : "Not narcissist number"); // printing the result using ternary operator by invoking the digi_sum_power() method
	}
}
