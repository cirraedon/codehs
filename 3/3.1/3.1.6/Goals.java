import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = scanner.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int actual = scanner.nextInt();
        // Compare numbers by creating three booleans
        boolean over = actual > goal;
        boolean under = actual < goal;
        boolean met = actual == goal;
        // Display results as instructed
        System.out.println("Went over goal?" + over);
        System.out.println("Did not meet goal?" + under);
        System.out.println("Met goal exactly?" + met);
    }
}