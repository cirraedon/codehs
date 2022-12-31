public class PlayerTester
{
    public static void main(String[] args) {
       
        CricketPlayer BL = new CricketPlayer("Brian Lara", "Trinidad and Tobago");
        CricketPlayer FA = new CricketPlayer("Fabian Allen");
       
        BL.addMatch(10, 2);
        BL.addMatch(10, 2);
        BL.addMatch(8, 2);
        BL.addMatch(8, 1);
       
        FA.addMatch(12, 21);
        FA.addMatch(12, 20);
        FA.addMatch(12, 20);
        FA.addMatch(11, 20);
       
        System.out.println("Brian Lara's Stats: ");
        BL.printRunsScored();
        BL.printBallsBowled();
        System.out.println(BL);
        System.out.println("Fabian Allen's Stats: ");
        FA.printRunsScored();
        FA.printBallsBowled();
        System.out.println(FA);
    }
}