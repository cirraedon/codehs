public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double a1 = Math.random() + 1;
        double a2 = Math.random() + 1;
        
        
        // Create two Racecar objects
        Racecar r1 = new Racecar(a1, "d1");
        Racecar r2 = new Racecar(a2, "d2");
        
        // Compute the finishing times for both cars
        double t1 = r1.computeTime(distance);
        double t2 = r2.computeTime(distance);
        
        // Print times of each car
        System.out.println(r1 + " finished in " + t1 + " seconds");
        System.out.println(r2 + " finished in " + t2 + " seconds");
    }
}