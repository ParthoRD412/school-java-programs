import java.util.Scanner;
class Spiral {
    // Function print matrix in spiral form
    static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            System.out.println();
            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
                System.out.println();
            }
            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    } 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);//Scanner instance
        //Taking user inputs
        System.out.println("Enter the number of rows : ");
        int R = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int C = sc.nextInt();
        System.out.println("Enter the array elements : ");
        //Creating the array
        int a[][] = new int[R][C];
        //Taking array elements as user input
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral form of the array is : ");
        // Function Call
        spiralPrint(R, C, a);
    }
}