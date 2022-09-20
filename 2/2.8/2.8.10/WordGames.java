public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        String h1 = word.substring(0, word.length()/2);
        String h2 = word.substring(word.length()/2, word.length());
        
        return h2 + h1;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
       String s1 = word.substring(0, insertIdx);
       String s2 = word.substring(insertIdx, word.length());
       
       return s1 + insertText + s2;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int i = word.indexOf(insertChar);
        String s1 = word.substring(0, i);
        String s2 = word.substring(i, word.length());
        
        return s1 + insertText + s2;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
    
    
}