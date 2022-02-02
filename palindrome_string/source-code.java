import java.util.*; // importing all the classes of the util package
public class pali_word // class name declaration
{
	boolean pali_word_check(String st) // this is a boolean method to check whether a word is palindrome word or not!
	{
		String s = ""; // a string accumulator to store the reversed string
		for(int i=0;i<st.length();i++) // running loop to reverse the string
		{
			s = st.charAt(i)+s;
		}
		return (st.equals(s))? true : false; // checking whether the word enterd and the reversed word is equal using ternary operator and returning it to the calling module
	}

	String pali_to_nonpali(String st) // this module is to convert the palindrome word to non palindrome word by adding a character which as per the ASCII is the next charater to the last character of the word
	{
		return st+(char)((int)st.charAt(st.length()-1)+1);
	}

	public static void main(String[] args) // running main() method
	{
		Scanner in = new Scanner(System.in); // scanner class object creation
		pali_word ob = new pali_word(); // class object creation
		
		System.out.println("Enter a string : ");
		String st[] = ((in.nextLine().trim()).toLowerCase()).split(" +"); // taking a string input and removing all the spaces from the beginning and the end and then converting it into a string array
		System.out.println("\nThe palindrome words are converted to non palindrome words : ");
		
		for(int i = 0;i<st.length;i++) // this module is to extract the words from the string array
		{
			if(ob.pali_word_check(st[i]) == true) // checking if the word is a palindrome word or not
			System.out.println(ob.pali_to_nonpali(st[i])); // printing the palindrome word after converting it to not palindrome word
		}
	}
}
