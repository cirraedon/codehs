import java.util.Scanner;
import java.lang.Math;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       Scanner scanner = new Scanner(System.in);
       
       double rating = scanner.nextDouble();
       
       System.out.println("Rating rounded: " + Math.round(rating));
    }
}