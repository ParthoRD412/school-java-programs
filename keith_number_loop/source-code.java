//To check if a number is a keith number or not
import java.util.Scanner; //Scanner class to be used in the program
public class KeithNumber{//Class declaration
public static void main(String[] args) { //Main method(Driver code)
     Scanner sc = new Scanner( System.in );//Created a scanner 
     System.out.print("Input a number: ");
     int n = sc.nextInt();//Taking the number as an input from the user
     int n1 = n;//Storing the number in a temporary variable
     String s = Integer.toString(n);//Converting the number to String form
     int d=s.length();//Storing the length of the string in the 
     int arr[]=new int[n];//Creatig an array of the same size of the number
     int i, sum;//Variable declaration
     for(i=d-1; i>=0; i--)//For loop till the length of the number
     {
         arr[i]=n1 % 10;//Transferring each digit of the number to the corresponding index in the array
         n1=n1/10;
     }
     i=d; sum=0;//Reinitializing i and sum
     while(sum<n)//Another loop for each digit of the number
     {
         sum = 0;//sum initialized to 0
         for(int j=1; j<=d; j++)
         {//Nested for loop running from 1 to the 
             sum=sum+arr[i-j];//Updated the value of sum with the element at index i-j
         }
         arr[i]=sum;//storing the sum in the given index
         i++;//Increasing i by 1
     }
    if(sum==n) //checking if the value of the number is the same as the sum
        System.out.println("Keith Number");
     else
        System.out.println("Not a Keith Number");
    }//main method terminated
}//Class terminated
