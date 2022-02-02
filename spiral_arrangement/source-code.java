import java.util.*;
public class spiral
{
	int[][] sorted_matrix(int arr[][])
	{
		
		return arr;
	}

	String spiral(int arr[][])
	{
		
		return "";
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns : ");
		int n = in.nextInt();
		int arr[][] =  new int[n][n];
		String org = "";
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = in.nextInt();
				org += arr[i][j] + " ";
			}
			org += "\n";
		}

	//	System.out.println("The original matrix :\n "+org+"\n\nThe spiral matrix :\n"+spiral(arr));
	}
}
