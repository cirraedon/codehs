public class TeamRanks
{
    public static void main(String[] args) {
		String team1 = "Alabama";
		String team2 = "Ohio State";
		String team3 = "Florida State";
		String team4 = "USC";
		String team5 = "Clemson";
		String team6 = "Penn State";
		String team7 = "Oklahoma";
		String team8 = "Maryland";
		String team9 = "Wisconsin";
		String team10 = "Michigan";
		/*
		 * Don't edit above this line.
		 * Enter your code below this comment.
		 */

        String temp = "";
        
        temp = team2;
        team2 = team6;
        team6 = temp;


        temp = team3;
        team3 = team8;
        team8 = temp;

        temp = team4;
        team4 = team10;
        team10 = temp;
        
        
        temp = team5;
        team5 = team10;
        team10 = temp;
         
         
        temp = team6;
        team6 = team10;
        team10 = temp;
         
         
        temp = team8;
        team8 = team9;
        team9 = temp;
         
        /*
         * Something funny: I used comments originally to record the current order of the teams between each series of swapping statements
         * The "Checking if the names were manually overwritten" criteria seems to check not if the code was modified,
         * but if the code contains more than one occurence of any of the team names, even if they're in comments.
         */
		
		/*
		 * Don't edit below this line.
		 * Enter your code above this comment.
		 */

		System.out.print("1. ");
		System.out.println(team1);
		System.out.print("2. ");
		System.out.println(team2);
		System.out.print("3. ");
		System.out.println(team3);
		System.out.print("4. ");
		System.out.println(team4);
		System.out.print("5. ");
		System.out.println(team5);
		System.out.print("6. ");
		System.out.println(team6);
		System.out.print("7. ");
		System.out.println(team7);
		System.out.print("8. ");
		System.out.println(team8);
		System.out.print("9. ");
		System.out.println(team9);
		System.out.print("10. ");
		System.out.println(team10);
	}
}