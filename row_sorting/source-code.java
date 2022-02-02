import java.util.*; // importing all the classes of the util package
public class matrix // class name declaration
{
    String array_sorting(int arr[]) // this is the module which returns the row sorted array in string format
    {
        int n = arr.length; // this is for storing the length of the array in the variable n
        
        // using bubble sorting to array the elements of the array in ascending order
        for(int i=0;i<n-1;i++) // set of loops to sort the array in ascending order
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int copy = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = copy;
                }
            }
        }

        String st = ""; // this is a string accumulator to store the sorted array in a string format
        for(int i=0;i<n;i++) // running the loop to extract the array characters and storing it in the string
            st = st + arr[i] + " ";

        return st; // returning the string to the calling module
    }

    public static void main(String args[]) // running main() function
    {
        Scanner in = new Scanner(System.in); // Scanner class object creation
        matrix ob = new matrix(); // class object creation
        System.out.println("Enter the number of rows and columns : ");
        int row = in.nextInt(); // taking the number of rows of the matrix input
        int column = in.nextInt(); // taking the number of columns of the matrix input

        String st = "", s = ""; // declaring and initializing string accumulators
        int arr[] = new int[column]; // creating an SDA to store the matrix elements one row at a time
        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<row;i++) // this is a set of loops to take the array elements input
        {
            for(int j=0;j<column;j++)
            {
                arr[j] = in.nextInt();
                s = s + arr[j] + " "; // concating the array elements to store the original matrix one row at a time
            }
            s = s + "\n"; // giving a newline to go to the next line of the matrix
            st = st + ob.array_sorting(arr) +"\n"; // storing the sorted matrix in the string accumulator one row at a time
        }

        System.out.println("\nThe matrix is : \n"+s+"\nThe sorted matrix :\n"+st); // printing the original as well as the sorted matrix
    }
}