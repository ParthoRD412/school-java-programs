import java.util.*; // importing all the classes of the util package
public class fascinating // decalaration of the class name
{
	int freq(int n,int a) // this is a recursive parameterised  method to find the frequency of a digit in a number
	{
		if(n==0) // base case
			return 0;

		else if(n%10 == a) // increment in the frequency of the digit is found
			return 1+freq(n/10,a);

		else // updation of the recursive loop
			return freq(n/10,a);
	}

	public static void main(String args[]) // main() method running
	{
		Scanner in = new Scanner(System.in);
		fascinating ob = new fascinating();
		System.out.println("Enter a number : ");
		int n = in.nextInt(); // taking input
		int a = Integer.parseInt(n+""+(n*2)+""+(n*3)); // concating the number with its twice and thrice multiple
		int c = 0; // counter to keep the record of the frequency of numbers being present
		for(int i=1;i<=9;i++) // running for loop t
		{
			if(ob.freq(a,i)==1) // if the frequency of a digit present in the number is exactly 1 then then the counter will be incremented
				c++; //incrementation of the counter variable
		}
		if(c==9) // if all the numbers from 1 to 9 are  present in the number exactly once then it is a fascinating number else not!
			System.out.println("Fascinating number");
		else
			System.out.println("Not fascinating number");
	}
}
