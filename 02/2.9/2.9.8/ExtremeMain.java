import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create an Extremes object
        Extremes e = new Extremes();

        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is? ");
        Integer max = scanner.nextInt();

        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        System.out.println("You'd need to multiply your number by" + 
                            e.maxQuotient(max) + 
                            "to reach the max value!");

        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is? ");
        Integer min = scanner.nextInt();

        // Compute and display what they'd need to multiply by
        // to reach the minimum number
        System.out.println("You'd need to multiply your number by" + 
                            e.minQuotient(min) + 
                            "to reach the max value!");

    }
}