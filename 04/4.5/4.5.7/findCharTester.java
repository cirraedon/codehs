public class findCharTester
{
    public static void main(String[] args)
    {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }
    
    /// this implementation is about 4-5 times faster than the given implementation
    public static boolean findChar(String string, String key)
    {
        // Write a more efficient version of isChar than the one in the exercise description
        // Use the hint!
        char c = key.charAt(0);
        
        if (string.indexOf(c) == -1) {
            return false;
        }
        return true;
    }
}