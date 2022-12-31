import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third integer: ");
        int c = scanner.nextInt();
        
        int median = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
        
        System.out.println("The median is " + median);
    }
}