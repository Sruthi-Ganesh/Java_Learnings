// BlueJ Project: lesson4/book7
// Video: Working with the Book Text
    
import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        // TODO: Create an scanner object to read the user input
        // Read a word from the scanner and assign it to a String variable named word

        // TODO: Create a book object that reads from aliceInWonderland.txt
       
        Book bookText =  new Book("aliceInWonderland.txt");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String word = in.nextLine();
        int actualLength = bookText.length();
        int removedLength = bookText.replace(word,"").length();
        int occurrences = (actualLength - removedLength)/word.length();
        

        // TODO: Find the number of occurences of that word and assign it to a variable named occurences
        System.out.println(word + " occurs " + occurrences + " times!");
    }
}
