public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        for (int i = 9; i>0; i--) {
            for (int j = 0; j<(9-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}