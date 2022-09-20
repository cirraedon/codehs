import java.util.Scanner;

public class ConstructionTester {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the sales tax rate:");
        double tax = scanner.nextDouble();
        
        System.out.println("How many boards do you need?");
        int boards = scanner.nextInt();
        
        System.out.println("How many windows do you need?");
        int windows = scanner.nextInt();
        
        Construction total = new Construction(8.0, 11.0, tax);
        
        double boardCost = total.lumberCost(boards);
        double windowCost = total.windowCost(windows);
        
        double sub = boardCost + windowCost;
        System.out.println("Total: " + sub);
        
        double grand = total.grandTotal(sub);
        System.out.println("Grand Total: " + grand);
    
    }

}