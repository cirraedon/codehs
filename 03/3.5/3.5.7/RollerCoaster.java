import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        
        if (h >= 42 && a >= 9) {
            System.out.println("Welcome aboard!");
        }
        else {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}