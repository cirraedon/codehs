import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("Enter the letter to be replaced: ");
        String letterToReplace = scanner.nextLine();
        
        System.out.println("Enter the new letter" );
        String replacement = scanner.nextLine();
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println("Result: " + replaceLetter(word, letterToReplace, replacement));

    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replace)
    {
        char replacement = replace.charAt(0);
        StringBuilder sb = new StringBuilder(word);
        
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                if (count > 0) {
                    sb.setCharAt(i, replacement);
                }
                count++;
            }
        }
        return sb.toString();
    }
}