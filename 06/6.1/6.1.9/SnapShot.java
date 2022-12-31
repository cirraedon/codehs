public class SnapShot
{
    public static void main(String[] args)
    {
        String[] words = {"Welcome", "to", "the snap shot", "app!"};
        
        for (String word : words) {
            System.out.println(word);
        }
        
        words[0] = "Upgrade";
        words[3] = "premium app!";
        System.out.println();
        
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
