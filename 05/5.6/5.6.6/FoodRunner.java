import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        Food w = new Food("Hamburgers", 600);
        Food t = new Food("French Fries", 350);
        Food b = new Food("Coke", 200);
        
        System.out.println(w + "\nHow many would you like?");
        int ws = s.nextInt();
        
        System.out.println(t + "\nHow many would you like?");
        int ts = s.nextInt();
        
        System.out.println(b + "\nHow many would you like?");
        int bs = s.nextInt();
        
        int total = ws * w.getCalories() + ts * t.getCalories() + bs * b.getCalories();
        
        System.out.println("Your meal will have a total of " + total + " calories");
    }
}