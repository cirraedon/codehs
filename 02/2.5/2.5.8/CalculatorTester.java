import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two doubles ");
        double dub1 = scanner.nextDouble();
        double dub2 = scanner.nextDouble();
        
        c.sum(dub1, dub2);
        c.subtract(dub1, dub2);
        c.multiply(dub1, dub2);
        c.divide(dub1, dub2);
    }
}