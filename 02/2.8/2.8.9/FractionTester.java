import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner scanner = new Scanner(System.in);
        Fraction half = new Fraction(1, 2);
        
        // Ask for input
        System.out.println("Enter the numerator: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter the denominator:");
        int d = scanner.nextInt();
        
        // Create a new Fraction with the user's input
        Fraction f = new Fraction(n, d);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        Fraction sum = half.sumFractions(f);
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(half + " + " + f + " = " + sum);
        
    }
}