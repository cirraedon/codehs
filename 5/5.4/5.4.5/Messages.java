public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
        // Then use the accessor methods to print out the instance variables
        Comment c1 = new Comment("a", "wtb", "10/10/10");
        Comment c2 = new Comment("b", "omg !!! ! 1. ! ! ", "11/22/11");
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println(c1.getPoster() + " " + c2.getDate());
    }
}