import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        
        Scanner scanner = new Scanner(System.in);
        
        while (!game.checkWin() && game.getTurn() < 9) {
            game.printBoard();
            if (game.getTurn() % 2 == 0) {
                System.out.println("It's X's turn. Input the row and column, space separated, of where you would like to mark: ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                
                if (game.pickLocation(row, col)) {
                    game.takeTurn(row, col);
                } else {
                    System.out.println("Invalid Space. Try again.");
                }
            } else {
                System.out.println("It's O's turn. Input the row and column, space separated, of where you would like to mark: ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                
                if (game.pickLocation(row, col)) {
                    game.takeTurn(row, col);
                } else {
                    System.out.println("Invalid Space. Try again.");
                }
            }
        }
        
        game.printBoard();
        
        if (game.checkWin()) {
            System.out.println("Congratulations. " + game.whoWon() + " wins.");
        } else {
            System.out.println("Draw.");
        }
    }
}
