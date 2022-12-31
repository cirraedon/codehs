import java.util.Scanner;

public class WordGameTester
{
    /*
    You don't actually need to implement 
    the main method for the code checks to pass     
    */
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for a word

        System.out.println("Enter a word: ");
        String s = scanner.nextLine();
        WordGames wg = new WordGames(s);
        
        // Scramble it
        // Print out scrambled word
        System.out.println(wg.scramble());
        
        
        // Ask for an index
        System.out.println("Enter an integer: ");
        int idx = scanner.nextInt();
        scanner.nextLine();  // skip over the newline
        
        // Ask for a random word
        System.out.println("Enter another word: ");
        String word = scanner.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(wg.bananaSplit(idx, word));
        
        
        // Ask for a character (store as a String)
        System.out.println("Enter a char: ");
        String c = scanner.nextLine();
        // Ask for random word
        System.out.println("Enter another word: ");
        // Add random word at character
        // Print out the word
        System.out.println(wg.bananaSplit(c, word));
        
        
    }
}