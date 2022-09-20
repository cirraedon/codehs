import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First Int: ");
        int int1 = scanner.nextInt();
        System.out.println("Second Int: ");
        int int2 = scanner.nextInt();
        
        System.out.print((double)int1/int2);

    }
}