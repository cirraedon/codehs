import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int startingNum = input.nextInt();
       System.out.println(countdown(startingNum));
       
    }
    
    public static String countdown(int number)
    {
       
       if (number <= 0) {
           return "Blastoff!";
       }
       
       return number + " " +  countdown(number - 2);
       
    }
}