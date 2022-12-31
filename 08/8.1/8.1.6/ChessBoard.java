public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        
        String[] end = {"Rook" , "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        
        for (int i = 0; i < 8; i++) {
            if (i == 0 || i == 7) {
                chess[i] = end;
            } else if (i == 1 || i == 6) {
                for (int j = 0; j < 8; j++) {
                    chess[i][j] = "Pawn";
                }
            }
            else {
                for (int j = 0 ; j < 8; j++) {
                    chess[i][j] = "-";
                }
            }
        }
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
