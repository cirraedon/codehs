import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input your name: ");
        
        String name = input.next();
        
        Hello hello = new Hello(name);
        
        hello.chinese();
        hello.french();
        hello.english();
    }
}