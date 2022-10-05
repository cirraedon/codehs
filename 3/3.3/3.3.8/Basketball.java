import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter player one's name: ");
        String p1 = scanner.nextLine();
        System.out.println("Enter player two's name: ");
        String p2 = scanner.nextLine();
        
        System.out.println("Enter " + p1 + "'s score");
        int s1 = scanner.nextInt();
        System.out.println("Enter " + p2 + "'s score");
        int s2 = scanner.nextInt();
        
        if (p1.compareTo(p2) < 0) {
            System.out.println(p1 + " scored " + s1 + " points");
            System.out.println(p2 + " scored " + s2 + " points");
        }
        else {
            System.out.println(p2 + " scored " + s2 + " points");
            System.out.println(p1 + " scored " + s1 + " points");
        }
        
        if (s1 < s2) {
            System.out.println(p2 + " wins!");
        }
        else if (s1 == s2) {
            System.out.println("Ti1");
        }
        else {
            System.out.println(p1 + " wins!");
        }
    }
}