public class Parakeet 
{
    private String name;
    // Add an instance variable here for color.
    private String color;
    
    public Parakeet(String birdsName, String col)
    {
        name = birdsName;
        color = col;
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + color + " parakeet";
    }
}