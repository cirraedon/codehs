import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        String[] players = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name of player to add: ");
            
            String player = scanner.nextLine();
            
            while (true) {
                if (search(availablePlayers, player) != -1) {
                    players[i] = player;
                    availablePlayers.remove(search(availablePlayers, player));
                    System.out.println("Successfully added player\n");
                    
                    break;
                } else {
                    System.out.println(player + " is not an available player.\nEnter name of player to add:");
                    player = scanner.nextLine();
                }
            }
            
        }
        
        System.out.println("Final Team Roster: "); 
        
        for (String p : players) {
            System.out.println(p);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        return array.indexOf(player);
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
