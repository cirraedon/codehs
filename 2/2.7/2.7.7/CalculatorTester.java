import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two doubles ");
        double dub1 = scanner.nextDouble();
        double dub2 = scanner.nextDouble();

        Calculator calculator = new Calculator();
        
        System.out.println(dub1 + " + " + dub2 + " = " + calculator.sum(dub1, dub2));
        System.out.println(dub1 + " - " + dub2 + " = " + calculator.subtract(dub1, dub2));
        System.out.println(dub1 + " * " + dub2 + " = " + calculator.multiply(dub1, dub2));
        System.out.println(dub1 + " / " + dub2 + " = " + calculator.divide(dub1, dub2));
    }
}