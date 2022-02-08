import java.util.*; //Importing Scanner class from util package
public class Emirp{//Class declaration
    int n;//class Variable declared
    Emirp(int nn){n=nn;}//Constructor to assign nn to class bariable n
    public static int isPrime(int n){//Method to check for a prime number
        if (n <= 1)
            return 0;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return 0;
        return 1;
    }
    public static void isEmirp(int n){//Method to check for Emrip number
        if (isPrime(n) == 0)//isPrimemethod called to check whether the number is actually a prime number or not.
            System.out.println("Not Emirp number");//In case the number is composite
        int rev = 0;//Variable ro store reverse of the number
        int copy = n;//Making a copy of the variable n
        while (n != 0) {//Number reversing algorithm by going through each digit from the end
            int d = n % 10;//Digit extraction
            rev = rev * 10 + d;//Reverse number updated
            n /= 10;//Number updated i.e. 1 digit reduced
        }
        if(isPrime(rev)==1)
        System.out.println("Yes Emirp number");//If number is prime and rev = number then its an emirp number
        else
        System.out.println("Not Emrip number");
    }
    public static void main(String args[]){//Main method to call all the functions
        Scanner sc=new Scanner(System.in);//Scanner instance
        System.out.println("Enter a number");int n=sc.nextInt();//Input taken from the user.
        Emirp op=new Emirp(n);op.isEmirp(n);//Instace created and methods called through the instance
    }
}
