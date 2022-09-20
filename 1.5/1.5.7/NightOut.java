import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How much does dinner usually cost?");
        double dinnerCost = input.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double ltCost = input.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        double icCost = input.nextDouble();
        
        double totalDinnerCost = dinnerCost * 3;
        double totalLTCost = ltCost * 2;
        double totalICCost = (icCost * 4) / 3;
        double totalCost = totalDinnerCost + totalLTCost + totalICCost;
        
        System.out.println("Dinner: $" + totalDinnerCost + "\nLaser Tag: $" + totalLTCost + "\nIce-cream: $" + totalICCost + "\nGrand Total: $" + totalCost);
        
        
    }
}