import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight(scanner);
        
    }
    
    public static void guessTheHeight(Scanner s) 
    {  
        // Your code goes here!
        // Allow the user to keep guessing until they guess the correct height
        System.out.println("Guess the height: ");
        while (s.nextInt() != 8848) {
            System.out.println("That's not it! \nGuess the height: ");
        }
        
        System.out.println("Right! Mt. Everest is 8848 meters tall!");
    }
}