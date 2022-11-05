import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char c1;
        char c2;
        // omg option 1 --- A or 2
        System.out.println("Choose one: [A] or [2] (enter your choice):");
        c1 = scanner.nextLine().charAt(0);
            ///////option branch 1 chose A! !!!
            if (c1 == 'A') {
                //// option b1 2 --- B or 14
                System.out.println("Choose one: [B] or [14] (enter your choice):");
                c2 = scanner.nextLine().charAt(0);
                    /// user choose B --- gets a B in all classes cry abt it
                    if (c2 == 'B') {
                        System.out.println("looks like you got a B in all of your classes");
                    }
                    /// user chose 14 --- 14 million dollars is delivered to the user
                    else if (c2 == '1') {
                        System.out.println("you just won 14 million dollars !! !");
                    }
                    else {
                        System.out.println("that wasn't a valid choice. looksl ike you dide lmfao");
                    }
            }
            //// optuion pranch 2 chose twoO!! !
            else if (c1 == '2') {
                ///option b2 r --- Cheese or Chocolate
                System.out.println("Chee[s]e or Choco[l]ate?");
                String choice = Scanner.nextLine();
                if (choice.equals("s")) {
                    c2 = 's';
                }
                else if (choice.equals("l")) {
                    c2 = 'l';
                }
                else {
                    c2 = 'z';
                }

                /// user chose Cheese --- user gets cheese
                if (c2 == 's') {
                    System.out.println("You recieve 17 kilograms of cheese");
                }
                /// user chose Chocoloate --- user gets cheese
                else if (c2 == 'l') {
                    System.out.println("The wish god is in a bad mood. You recieve 17 kilograms of cheese");
                }
                else {
                    System.out.println("that wasn't a valid choice. looksl ike you dide lmfao");
                }
            }
            ///////tthere is so much cheese in this warehouse
            else {
                System.out.println("cheesecheesecheesecnmsbzs");
            }
    }
}