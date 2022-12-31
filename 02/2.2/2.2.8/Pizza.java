import java.util.ArrayList;

public class Pizza
{
    // Add the instance variables here
    private String type;
    /* private ArrayList<String> toppingsList; */
    private String toppings;
    private int size;
    

    // Put the constructor here
    
    public Pizza(String typ, String toppingsString, int siz /*ArrayList<String> topping, */) {
        type = typ;
        size = siz;
        /* toppingsList = topping; */
        toppings = toppingsString;
    }
    
    // You don't need to do anything with this method
    // Used to print the object
    /*
    public String compltoString()
    {
        String baseString = size + " inch " + type + " pizza with ";
        
        for (int i = 0; i < toppingsList.size(); i++) {
            baseString += toppingsList.get(i);
            if (i != toppingsList.size()-1) {
                baseString += ", ";
            }
            
        }
        
        return baseString;
    }
    */
    
    public String toString() {
        return size + " inch " + type + " pizza with " + toppings;
    }
}