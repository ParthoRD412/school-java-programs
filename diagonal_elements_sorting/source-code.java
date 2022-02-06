import java.util.*; // importing all the classes of the util package
public class  diagonal_sorting // class name declaration
{
    public static void main(String args[]) // running the main() method
    {
        Scanner in = new Scanner(System.in); // scanner class object creation
        System.out.println("Enter the number of rows for the square matrix : ");
        int n = in.nextInt(); // taking the matrix length input
        int arr[][]=new int[n][n]; // matrix declaration and initialization
		String st = ""; // string accumulator to store the matrix elements
		
		System.out.println("\nEnter the matrix elements :");
		for(int i=0;i<n;i++) // nested loop to take the matrix elements input and adding them in the string accumulator
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = in.nextInt();
				st += arr[i][j]+" ";
			}
			st += "\n";
		}

		System.out.println("\nThe original matrix : \n"+st); // printing the original matrix

		int left[] = new int[n]; // declaring an SDA to store the left diagonal
		int right[] = new int[n]; // declaring and SDA to store the right diagonal
		for(int i=0;i<n;i++) // Extracting the left diagonal elements from the matrix arr and storing it in the SDA left
		{
			left[i] = arr[i][i];
		}
		Arrays.sort(left); // sorting the left array in ascending order

		int a = 0;
		for(int i=n-1;i>=0;i--) // extracting the right diagonal elements form the matrix arr and storing it in the SDA right
		{
			right[a] = arr[a][i];
			a++;
		}
		Arrays.sort(right); // sorting the right array in ascending order

		String l="", r=""; // these are string accumulators to store the sorted left and right diagonal elements
		for(int i=0;i<n;i++)
		{
			l = l+left[i]+", ";
			r = r+right[i]+", ";
		}

		System.out.println("The left diagonal : "+l+"\nThe right diagonal : "+r); // printing the left and the right diagonal elements
    }
}
