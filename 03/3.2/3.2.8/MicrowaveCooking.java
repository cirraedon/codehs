public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       int s = 90 * (int) Math.floor(Math.random() * 150 + 1);

       // Print the number of seconds
       System.out.println("Microwaving for " + s + "seconds");
       
       // Use two if statements to print the temperature
       if (s <= 120) {
           System.out.println("Rolls will be the right temperature!");
       }
       else {
           System.out.println("Rolls will be boiling hot!");
       }
    }
}