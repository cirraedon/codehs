public class Scores
{
    public static void main(String[] args)
    {
        int[] scores = {80, 95, 82, 67, 100};
        
        for (int score : scores) {
            System.out.println(score);
        }
        
        scores[2] = 72;
        scores[4] = 95;
        
        System.out.println();
        
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
