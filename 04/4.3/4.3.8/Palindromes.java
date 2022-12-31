import java.util.*;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        // Create user input and let user know whether their word is a palindrome or not!
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type in your text: ");
        String text = scanner.nextLine();
        if (isPalindrome(text)) {
            System.out.println("your word is a palindrome!");
        } else {
            System.out.println("Not a palindrome :(");
        }
        
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
    
    /// reversing a string is so inefficient...
    /// but for reference, it's coded
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        StringBuilder sb = new StringBuilder(text);
        
        return sb.reverse().toString();
        
    }

}