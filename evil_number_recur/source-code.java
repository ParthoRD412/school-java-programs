import java.util.*; // importing all the classes of the util package
public class evil // class name declaration
{
    int decimal_to_binary(int n) // this is the function to convert a decimal number to binary number
	{
		String st = ""; // this is a string accumulator to store the binary number in string format
		while(n!=0) // running while loop to convert the decimal number to binary number
		{
			st = n%2 + st; // concating the numbers to form a binary number
			n /= 2; // updation of the  loop
		}
		return Integer.valueOf(st); // returning the binary number after converting it to integer in the return statement
	}

    int freq(int n) // this is a recursive method to to find the frequency of 1's in the binary number
    {
        if(n==0) // base case
            return 0; 
        
        else if((n%10)==1) // case for increment of the the frequency
            return 1+freq(n/10);
        
        else // case for updation of the recursive loop
            return freq(n/10);
    }

    public static void main(String args[]) // running the main function
    {
        Scanner in = new Scanner(System.in); // scanner class object creation
        evil ob = new evil(); // class object creation
        System.out.println("Enter a number :");
        int n = in.nextInt(); // taking input
        if(ob.freq(ob.decimal_to_binary(n))%2 == 0) // checking whether the number after converting to binary number system has even number of 1's or not
        System.out.println("Evil number");
        else
        System.out.println("Odious number(not evil number)");
    }
}