import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        /// note that the code would not work if the compound boolean was
        /// (dividend % divisor != 0 || divisor == 0)
        /// because Java reads the statement left to right
        /// and attempts to evaluate the modulus statement first
        /// this causes an Arithmetic Error (specifically, a DivisionByZero Error)
        /// when ordered this way, if the dividend is zero, 
        /// it moves into the if statement and doesn't try to evaluate
        /// the boolean that would cause an error
        if (divisor == 0 || dividend % divisor != 0) {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }
        else {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        
    }
}