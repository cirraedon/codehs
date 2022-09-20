import java.util.ArrayList;

public class PizzaTester 
{
    public static void main(String[] args)
    {
        ArrayList<String> pizza1list = new ArrayList<>();
        pizza1list.add("Tomatoes");
        pizza1list.add("onions");
        pizza1list.add("olives");
        
        String toppings1 = "Tomatoes, onions, olives";
        
        ArrayList<String> pizza2list = new ArrayList<>();
        pizza2list.add("Cheese");
        
        String toppings2 = "Cheese";
        
        ArrayList<String> pizza3list = new ArrayList<>();
        pizza3list.add("Pepperoni");
        pizza3list.add("sausage");
        pizza3list.add("bacon");
        
        String toppings3 = "Pepperoni, sausage, bacon";
        
        Pizza pizza1 = new Pizza("Veggie", /* pizza1list, */  toppings1, 12);
        Pizza pizza2 = new Pizza("Cheese", /* pizza2list, */ toppings2, 15);
        Pizza pizza3 = new Pizza("Meat", /* pizza3list, */ toppings3, 20);
        
        
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}