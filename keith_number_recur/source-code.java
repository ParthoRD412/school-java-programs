//To check if a number is a keith number or not using recursion.
import java.util.Scanner;

public class keit_recur{

    public static int countDigits(int n){
        if(n < 10) return 1;

        return (countDigits(n/10)+1);
    }

    public static int sum(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            return array[index] + sum(array, index - 1);
        }
    }
    static boolean check_Keith(int num, int arr[], int counter){
        int c = counter;
        int number = num;
        int array[] = arr;

        int sum_of_digits = sum(array,array.length-1);

        if(num == sum_of_digits) return true;

        else if(num < sum_of_digits) return false;

        //Replace c th element
        array[c] = sum_of_digits;
        c++;

        if(c == array.length) c = 0;
        
        return check_Keith(number, array, c);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int count = 0;

        int temp = n;

        count = countDigits(n);

        System.out.println("There are "+count+" digits in the number.");

        temp = n;
        int digits[] = new int[count];

        //Tranfer the digits to the array
 
        for(int i = count-1; i>=0; i--){
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        
        
        // for(int i = 0; i < count; i++){
        //     System.out.print(digits[i] + " ");
        // }

        //now checking whether the number is a keith number or not
        boolean isKeith = check_Keith(n, digits, 0);

        if(isKeith){
            System.out.println("Keith number.");
        }
        else{
            System.out.println("Not a keith number.");
        }

        sc.close();

    }
}
 

/*
Approach : 

7 4 2  : s = 13 , c = 0
Replace 0 th element c++;
13 4 2 : s = 19 , c = 1
Replace 1st element c++
13 19 2 : s = 34 , c = 2
Replace 2nd element c++ // c = 3 here  reassign c to 0
13 19 34 : s = 66 , c = 0 //Reassigned c to 0
Replace 0th element
66 19 34 : s = 119, c = 1
Replace 1st element
66 119 34 : s = 219, c= 2
Replace 2nd element
66 119 219 : s = 404 , c= 3 reinit to 0
Replce 0th element
404 119 219 = 742 (Condition satisfied return true)
true.
*/
