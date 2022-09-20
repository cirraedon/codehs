public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String candyi, String colori, String shapei) {
        candy = candyi;
        color = colori;
        shape = shapei;
    }
    
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String colori, String shapei) {
        color = colori;
        shape = shapei;
        candy = "hard candy";
    }
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candyi) {
        candy = candyi;
        color = "rainbow";
        shape = "donkey";
    }
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}