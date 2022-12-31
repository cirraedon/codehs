public class PointTester
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        Point a = new Point(2, 4);
        
        // Then print it out
        System.out.println(a);
        // Move the point 5 units in the x direction and
        a.move(5, 2);
        // 2 units in the y direction
        
        // Print out the point again to see that it moved
        System.out.println(a);
    }
}