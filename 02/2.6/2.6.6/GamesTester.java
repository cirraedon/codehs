public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        
        // Square the number
        // Print it out
        System.out.println(game.squareNumber());
        
        // Double the number
        // Print it out
        System.out.println(game.doubleNumber());
        
        // Square the number again
        // Print it out
        System.out.println(game.squareNumber());
        
        // Get the number and store the value
        // Print out your stored value 
        double finalVal = game.getNumber();
        System.out.println(finalVal);
        
        // Get the number again then store and print
        // the value
        finalVal = game.getNumber();
        System.out.println(finalVal);
        
    }
}