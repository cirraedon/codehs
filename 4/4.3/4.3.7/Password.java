import java.util.*;

public class Password
{
    private static String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        System.out.println(passwordCheck(password));
        
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        if (password.length() >=8) {
            for (int i =0; i<password.length();i++) {
                if (allowedChars.indexOf(password.charAt(i)) == -1) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        
        return true;
    }
}