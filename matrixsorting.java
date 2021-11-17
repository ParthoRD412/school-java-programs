/*  take a square matrix input of int n[][] of size n*n. The maximum value of n is 20. Input the value of n and then input positive integers and perform the following operations on the matrix.
a) display the original matrix
b) print the row and the column number of the position of the largest element of the matrix
c) Print the row and the column number of the position of the second largest element of the matrix
d) Sort the elements of the matrix in ascending order and display the matrix
*/

import java.util.*; // importing all the classes of the util package for Scanner class
public class array // class name declaration
{
    public static void main(String args[]) // running the main function
    {
        Scanner in = new Scanner(System.in); // creating an object of Scanner class
        // taking the size of the matrix as input
        System.out.println("Enter the size of the matrix : ");
        int n = in.nextInt();
        // if the size of the matrix is greater than 20, then the program will terminate
        if(n>20)
        {
            System.out.println("The size of the matrix is too large");
            return;
        }
        // else part if the size of the matrix is less than 20
        else
        {
            int a[][] = new int[n][n]; // array declaration and initialisation
            // taking the array elements input
            System.out.println("Enter the elements of the matrix : ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j] = in.nextInt();
                }
            }
            // printing the original matrix
            System.out.println("The original matrix is : ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            // declaration of the variables for the larget and the second largest elements and there position
            int max = a[0][0]; // for storing the largest element
            int max_row = 0; // for storing the row number of the largest element
            int max_col = 0; // for storing the column number of the largest element
            int second_max = a[0][0]; // for storing the second largest element
            int second_max_row = 0; //  for storing the row number of the second largest element
            int second_max_col = 0; // for storing the column number of the second largest element

            // for loop for finding the largest element and its position
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    // if condition for finding the largest element
                    if(a[i][j]>max)
                    {
                        max = a[i][j];
                        max_row = i;
                        max_col = j;
                    }
                    // else part for the second largest element
                    else if(a[i][j]>second_max)
                    {
                        second_max = a[i][j];
                        second_max_row = i;
                        second_max_col = j;
                    }
                }
            }
            // printing the row and column number of the largest element
            System.out.println("The row and column number of the position of the largest element of the matrix is : "+max_row+" "+max_col);
            System.out.println("The row and column number of the position of the second largest element of the matrix is : "+second_max_row+" "+second_max_col);
            // printing the sorted matrix
            System.out.println("The sorted matrix is : ");
            // nested for loop to sort the matrix using bubble sort technique
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        for(int l=0;l<n;l++)
                        {
                            if(a[k][l]>a[i][j])
                            {
                                int temp = a[i][j]; // copying the value of the element to a temporary variable
                                a[i][j] = a[k][l];
                                a[k][l] = temp;
                            }
                        }
                    }
                }
            }
            // printing the sorted matrix
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
