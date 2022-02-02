import java.util.*; // importing all the classes of the util package!
public class bouncing // class name declaration
{
	int n; // instance variable declaration
	bouncing() // this is the default constructor
	{
		n = 0; // initialising the instance variables with the value of n = 0
	}

	void input() // this method is to take the input in the instance variable
	{
		Scanner in = new Scanner(System.in); // scanner class object creation
		System.out.println("Enter a number : ");
		n = in.nextInt(); // taking input
	}

	boolean isDecreasing(int a) // this module is to check whether the number is in a decreasing order
	{
		String st = a+""; // converting the integer to string
		boolean flag = true; // declaring a boolean variable flag with the default value true

		for(int i=0;i<st.length()-1;i++) // this loop is to extract the character from the string and to compare the ASCII
		{
			if(st.charAt(i)<st.charAt(i+1))
			{
				flag = false;
				break;
			}
		}
		return flag; // returning value of flag to the calling program
	}

	boolean isIncreasing(int a) // this module is to check whether the number is in an increasing order
	{
		String st = a+""; // converting the integer to string
		boolean flag = true; // declaring a boolean variable flag with the default value true

		for(int i=0;i<st.length()-1;i++) // this lop is to extract the character from the string and to compare the ASCII
		{
			if(st.charAt(i)>st.charAt(i+1))
			{
				flag = false;
				break;
			}
		}
		return flag; // returning the value of flag to the calling program
	}

	void display() // this method is to print whether the number is a bouncing number or not
	{
		input();
		System.out.println((isIncreasing(n)==true || isDecreasing(n)==true || n<101)? "Not a bouncing number" : "Bouncing number"); // printing the output
	}

	public static void main(String args[]) // running the main() function
	{
		bouncing ob = new bouncing(); // class object creation
		ob.display(); // calling the display method
	}
}
