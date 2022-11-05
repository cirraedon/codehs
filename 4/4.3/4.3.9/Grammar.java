import java.util.*;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence that uses the word 2 instead of to.");
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        String str = scanner.nextLine();
        System.out.println(useProperGrammar(str));
    }
    
    public static String useProperGrammar(String str)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        StringBuilder sb = new StringBuilder(str);
        int count=0;
        
        while (sb.indexOf("2") != -1) {
            sb.replace(sb.indexOf("2"), sb.indexOf("2")+1, "to");
            count++;
        }
        
        System.out.println("Fixed " + count + " grammatical errors: ");
        return sb.toString();
    }
}