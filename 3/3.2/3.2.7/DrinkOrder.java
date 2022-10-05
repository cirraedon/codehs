import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to drink? ");
        String drink = scanner.nextLine();
        System.out.println("How many teaspoons of sugar do you want? ");
        boolean sugar = scanner.nextInt() > 0;
        
        System.out.print("\n" + "Confirming your order. You wanted: " + "\n" + drink);
        if (sugar) {
            System.out.print(" with sugar");
        }
    }
}