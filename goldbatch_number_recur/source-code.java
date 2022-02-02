import java.util.*; // importing allt the classes of the util package
public class goldbatch // class name declaration
{

	boolean isGoldBatch(int n) // boolean method to check whether a number is goldbatch number or not!
	{
		for(int i=1;i<=n;i++) // running for loop to generate numbers and finding the numbers which are prime as well as the sum up to makethe number
		{
			if(div(i,1) == 2 && div(n-i,1) == 2)
			{
				System.out.println(i+" + "+(n-i)+" = "+n); // printing the sum of the numbers
				return true;
			}
		}
		return false;
	}

	int div(int n,int i) // this method is to return the frequency of numbers with which the entered number is divisible
	{
		if(n<i) // base case
			return 0;
		else if(n%i == 0) // incrementing the frequency of divisible numbers
			return 1+div(n,i+1);
		else // updation of the recursive loop
			return div(n,i+1);
	}

	public static void main(String args[]) // running the main method
	{
		Scanner in = new Scanner(System.in); // scanner class object creation
		goldbatch ob = new goldbatch(); // class object creation
		System.out.println("Enter a number : ");
		int n = in.nextInt(); // taking the number input
		if(ob.isGoldBatch(n)==true) // checking whether the number is a gold batch number or not!
			System.out.println("Goldbatch number");
		else
			System.out.println("Not goldbatch number");
	}
}
