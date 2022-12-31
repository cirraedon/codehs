import java.util.*;

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());
        
        // Ask the user to input a text message
        Scanner s = new Scanner(System.in);
        System.out.println("input a text message: ");
        String str = s.nextLine();
        
        // Call teenTalk method to translate the message to teen talk
        System.out.println(myFriend.teenTalk(str));
    }
}