import java.util.*;
import java.lang.Math;

public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        while (true){
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();
             
             if (number == -1){
                 break;
             }
             else {
                 numbers.add(number);
             }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }
    
    public static int findMinimum(ArrayList<Integer> numbers)
    {
        
        // Base Case: What is the smallest ArrayList you can have? 
        if (numbers.size() == 1) {
            // What is the minimum value of that array?
            return numbers.get(0);
        }
        
        return Math.min(numbers.remove(numbers.size()-1), findMinimum(numbers));
        // Recursive call: How do you find the minimum of the rest of the ArrayList?
        //                 (Not including the last element)
    
        // Return: The minimum of (the last element, minimum of the rest of the ArrayList)
        
    }
}