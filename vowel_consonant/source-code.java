import java.util.*; // importing all the classes of the util package
public class vowel_consonant // class name declaration
{
    boolean startsWithVowel(String st) // this is a method which checks whether a word begins with a vowel or not!
    {
        char ch = st.charAt(0);
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? true : false;
    }

    boolean endsWithConsonant(String st) // this is a method which checks whether a word ends with a consonant of not!
    {
        char ch = st.charAt(st.length()-1);
        return (ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')? true : false;
    }

    public static void main(String args[]) // running the main() method
    {
        Scanner in = new Scanner(System.in); // Scanner class object creation
        vowel_consonant ob = new vowel_consonant();        
        System.out.println("Enter a string : ");
        String st[] = ((in.nextLine().trim()).toLowerCase()).split(" +"); // taking a string input and removing all the spaces from front and behind and then converting it into lowercase and making an array of words with it!
        System.out.println("All the words which start with a vowel and end with a consonant : ");
        int c = 0; // counter to store the number of words satisfying the condition
        for(int i=0;i<st.length;i++) // this loop is to extract all the words from the array and invoking methods to check whether it starts with vowel and ends with consonant or not
        {
            if(ob.startsWithVowel(st[i]) == true && ob.endsWithConsonant(st[i]) == true)
            {
                c++; // incrementing the value of the counter if it satisfies the condition
                System.out.println(st[i]); // printing the word that satisfies the condition
            }
        }

        if(c==0) // this checks whether the number of words satisfying the conditoin is zero
            System.out.println("No words in the sentence begin with vowel and end with consonant");
    }
}