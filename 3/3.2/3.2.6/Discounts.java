import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Ask how many hours were you parked
        System.out.println("How many hours were you parked? ");
        int time = scanner.nextInt();
        // Compute cost - $4.25
        double total = 4.25 * time;
        // If parked for more than 3 hours, apply 25% discount
        if (time > 3) {
            total *= 0.75;
        }
        // If cost is under $7, set cost to $7
        if (total < 7) {
            total = 7.0;
        }
        // Display the final cost
        System.out.println("You owe $" + total);
    }
}