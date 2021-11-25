import java.util.*;
public class diagonal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix : ");
        int row= in.nextInt();
        System.out.println("Enter the number of columns of the matrix : ");
        int column = in.nextInt();
        if(row!=column)
        return;
        else
        {
            String st = "";
            int arr[][]=new int[row][column];
            for (int i =0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    arr[i][j]=in.nextInt();
                    st += arr[i][j]+" ";
                }
                st += "\n";
            }
            
            int left=0,right=0;
            int a=column-1;
            for(int i=0;i<row;i++)
            {
                left += arr[i][i];
                right += arr[i][a];
                a--;
            }
            System.out.println("The matrix that you entered is : \n"+st+"\n\nSum of left diagonal : "+left+"\nSum of right diagonal : "+right);
        }
    }
}
