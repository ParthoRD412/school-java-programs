import java.util.*;
public class dia2
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
            System.out.println("\nThe matrix that you have entered is : \n"+st);
            int left = 0,right = 0,next = arr[0][0];
            boolean ele = true;
            for (int i=1;i<column;i++)
            {
                if(next == arr[i][i])
                ele = false;
            }
            if(ele==true)
            {
            for(int i=0;i<row;i++)
            {
                left += arr[i][i];
            }
            System.out.println("The sum of the left diagonal elements is : "+left);
        }
            else
            System.out.println("The left diagonal elements have been repeated");
            
            
            ele = true;next = arr[0][row-1];
            int a = row -1;
            for(int i=1;i<row;i++)
            {
                if(next == arr[i][a])
                ele = false;
                a--;
            }
            a = row -1;
            if(ele == true)
            {
            for(int i=0;i<row;i++)
            {
                right += arr[i][a];
                a--;
            }
            System.out.println("The sum of the right diagonal is : "+right);
        }
        else
        System.out.println("The right diagonal elements have been repeated");
        }
    }
}
