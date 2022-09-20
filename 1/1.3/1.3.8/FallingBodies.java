public class FallingBodies
{
    
    private static final double g = 9.8;
    
    public static void main(String[] args)
    {
        System.out.println("The height of the waterfall is " + calculateHeight(23) + " meters. \nThe velocity of the pebble as it hits the is " + calculateVelocity(23) + "m/s.");
    }
    
    public static double calculateHeight(double t) {
        return 0.5 * g * t * t;
    }
    
    public static double calculateVelocity(double t) {
        return g * t;
    }
}