import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    
    private static String[] compChoices = {"rock", "paper", "scissors"};
    
    public static String genComp() {
        return compChoices[Randomizer.nextInt(0,2)];
    }
        
    public static String getWinner(String user, String computer)
    {
        if (computer.equals(user)) {
            return TIE;
        }
        
        if (user.equals("paper")) {
            if (computer.equals("scissors")) {
                return COMPUTER_PLAYER;
            }
            return USER_PLAYER;
        }
        
        if (user.equals("scissors")) {
            if (computer.equals("rock")) {
                return COMPUTER_PLAYER;
            }
            return USER_PLAYER;
        }
        
        if (computer.equals("paper")) {
            return COMPUTER_PLAYER;
        }
        
        return USER_PLAYER;
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String user = s.nextLine();
        String comp = genComp();
        System.out.println("User: " + user + "\nComputer: " + comp);
        
        while (!getWinner(user, comp).equals(USER_PLAYER)) {
            System.out.println(getWinner(user, comp));
            
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            user = s.nextLine();
            comp = genComp();
            System.out.println("User: " + user + "\nComputer: " + comp);
            
            String winner = getWinner(user, comp);
            
        }
        
        System.out.println("User wins!\nEnter your choice (rock, paper, or scissors):\nThanks for playing!");
    }
}