public class TicTacToe
{
    private char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    private int turn = 0;
    
    public TicTacToe() {
        
    }
    
    //this method returns the current turn
    public int getTurn()
    {
        return this.turn;
    }
   
    /*This method prints out the board array on to the console
    */
    public void printBoard()
    {
        for (int i = 0; i < 4; i++) {
            if ( i == 0 ) {
                System.out.print("  0 1 2");
            } else {
                System.out.print("\n" + (i-1) + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i-1][j] + " ");
                }
            }
        }
        System.out.println();
    }
   
    //This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col)
    {
        if (row <3 && row >=0 && col <3 && col >=0) {
           if (board[row][col] == '-') {
               return true;
           }
        }
        
        return false;
    }
   
    //This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col)
    {
        if (pickLocation(row, col)) {
            if (turn %2 == 0) {
                board[row][col] = 'X';
            } else {
                board[row][col] = 'O';
            }
        }
        
        this.turn++;
    }
   
    //This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow()
    {
        for (char[] arr : board) {
            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] != '-') {
                return true;
            }
        }
        
        return false;
    }
   
    //This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol()
    {
        char[] a1 = board[0];
        char[] a2 = board[1];
        char[] a3 = board[2];
        
        for (int i = 0; i < 3; i++) {
            if (a1[i] == a2[i] && a2[i] == a3[i] && a3[i] != '-') {
                return true;
            }
        }
        
        return false;
    } 
   
     //This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag()
    {
        if (board[0][0] == board[1][1] && board [1][1] == board[2][2] && board[2][2] != '-') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board [1][1] != '-') {
            return true;
        }
        
        return false;
    }
   
    //This method returns a boolean that checks if someone has won the game
    public boolean checkWin()
    {
        return (checkDiag() || checkCol() || checkRow());
    }

}
