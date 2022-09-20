import java.util.Scanner;
//Refer to your code from the previous Personalized T-shirts exercise. 
// Modify it using the Scanner class to take user input instead of hard coding 
//       the cost of the shrit. 

public class Tshirt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the cost of the t-shirt: ");
        int cost = input.nextInt();
        
        System.out.println("The t-shirt costs $" + cost);
        System.out.println("A personalized t-shirt costs $" + ++cost);
        cost++;
        cost--;
        System.out.println("Without personalization, the t-shirt costs $" + --cost);
    }
}