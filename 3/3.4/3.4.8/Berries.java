import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial of the berry: ");
        String s = scanner.nextLine();
        
        
        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        char c = s.charAt(0);
        // Remember that characters can be compared using == 
        if (c == 'E') {
            System.out.println("You ordered Elderberry");
        }
        else if (c == 'G') {
            System.out.println("You ordered Gooseberry");
        }
        else if (c == 'L') {
            System.out.println("You ordered Lingonberry");
        }
        else {
            System.out.println("Berry not recognized");
        }
    }
}