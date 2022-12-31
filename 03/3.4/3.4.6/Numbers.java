import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("The number is negative!");
        }
        else if (n > 0) {
            System.out.println("The number is positive!");
        }
        else {
            System.out.println("The number is neither positive nor negative!");
        }
    }
}