import java.lang.Math;

public class Timeline
{
    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("Age\t | M/YY - Description");
        for(int i = 7; i <= 15; i += 2) {
            count++;
            System.out.println(i + "\t | " + (int) Math.floor(Math.random()*12) + "/" + (7+i) + " - This is event " + count);
            
            for (int j = 0; j < 3; j++) { 
                count++;
                System.out.println(" \t | " + (int) Math.floor(Math.random()*12) + "/" + (7+i) + " - This is event " + count);
            }
        }
    }
}