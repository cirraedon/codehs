import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting Taffy Timer... \nEnter the temperature: ");
        
        while (scanner.nextInt() < 270) {
            System.out.println("The mixture isn't ready yet. \nEnter the temperature:");
        }
        
        System.out.println("Your taffy is ready for the next step!");
    }
}