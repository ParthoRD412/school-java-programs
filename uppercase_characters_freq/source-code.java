import java.util.*; // importing all the classes of the util package
public class upper // class name declaration
{
    static int uppercase_freq(String st) // this is a static module which returns the number of uppercase letters in a word
    {
        int c = 0; // this is the counter to store the number of uppercase letter

        for(int i=0;i<st.length();i++) // this loop is to extract the characters from the word
        {
            if(Character.isUpperCase(st.charAt(i))) // this checks whether the character is in uppercase or not
                c++; // incrementing the value of c
        }
        return c; // returning the value of c 
    }

    public static void main(String args[]) // running main() function
    {
        Scanner in = new Scanner(System.in); // Scanner class object creation
        System.out.println("Enter a string : ");
        String st[] = (in.nextLine().trim()).split(" "); // taking input and converting it into an array of words
        System.out.println("Word\tuppercase frequency");

        for(int i=0;i<st.length;i++) // this loop is to extract all the words from the character array
        {
            System.out.println(st[i]+"\t\t"+uppercase_freq(st[i])); // printing the word along with the number of upper case letters int the word
        }
    }
}
