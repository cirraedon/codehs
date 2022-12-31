import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a double:\n");
        
        double dubble = scanner.nextDouble();
        
        System.out.println(dubble + "\n" + (int)dubble + "\n" + (dubble+0.5) + "\n" + (int)(dubble+0.5));
        
    }
}