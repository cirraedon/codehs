import java.util.ArrayList;

public class Evens
{
    public static void main(String[] args)
    {
        // Create the evens ArrayList
        ArrayList<Integer> evens = new ArrayList<>();
        
        for (int i=50; i<=150;i++) {
            evens.add(i*2);
        }
        
        printArray(evens);
    }
    
    
    //Don't alter this method! It will print your array in the console
    public static void printArray(ArrayList<Integer> array)
    {
        System.out.println("Array:");
        for(int name: array)
        {
            System.out.print(name + " ");
        }
    }
}
