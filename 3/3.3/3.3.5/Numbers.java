import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How fast can you run a mile (in seconds)?");
        int time = scanner.nextInt();
        
        if (time < 223) {
            System.out.println("Are you sure? That's a new world record!");
        }
        else {
            System.out.println("Right on! Keep running!");
        }
    }
}