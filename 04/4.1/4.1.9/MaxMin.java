import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit: ");
        int curr = scanner.nextInt();
        while (curr != 0) {
            if (curr < smallest) {
                smallest = curr;
            }
            if (curr > largest) {
                largest = curr;
            }
            System.out.println("Results so far: ");
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Enter a number or 0 to quit: ");
            curr = scanner.nextInt();
        }
    }
}