import java.util.ArrayList;

public class ArrayListMethods {
    public static void condense(ArrayList<Double> a) {
        if (a.size() % 2 == 1) {
            return;
        }
        
        for (int i = 0; i<a.size(); i+=2) {
            a.set(i/2, a.get(i)*a.get(i+1));
        }
        
        int half = a.size()/2;
        
        while (a.size() != half) {
            a.remove(a.size()-1);
        }
    }
    
    public static void duplicate(ArrayList<Double> a) {
        int initSize = a.size();
        
        for (int i = 0; i < initSize; i++) {
            a.add(a.get(i));
        }
    }
    
    
    public static void print(ArrayList<Double> ds) {
        for (double d : ds) {
            System.out.println(d);
        }
    }
}
