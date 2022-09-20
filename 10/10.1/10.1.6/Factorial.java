import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long number = input.nextLong();
        
        System.out.println(calcFactorial(number));
    }
    
    public static long calcFactorial(long x)
    {
        if (x == 1) {
            return 1;
        }
        
        return x * calcFactorial(x-1);
    }
}