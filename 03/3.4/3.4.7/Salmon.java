import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for month of year as an integer
        int m = scanner.nextInt();
        
        // Use if/else if/else statement to determine if it is spawning season
        if (m >= 3 && m <= 6) {
            System.out.println("Spring spawning season");
        }
        else if (m >= 9 && m <= 11) {
            System.out.println("Fall spawning season");
        }
        else {
            System.out.println("Not spawning season");
        }
    }
}