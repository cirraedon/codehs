public class StringTrace
{
    public static void main(String[] args)
    {
        String str1 = null;
        String str2 = new String("Karel");
        String str3 = "Karel";
        
        if (str1 == null)
        {
            str1 = str2;
        }
        // this executes
        
        
        if (str1 == str2)
        {
            System.out.println("str1 and str2 refer to the same object");
        }
        // this executes
        /// while if you were to assign 2 String variables to the same string of characters
        /// reference variables store addresses, so when comparing them with the primitive "==", 
        /// Java doesn't recognize them as equal
        /// however, in this case, str2 is assigned to the same address stored in str1
        /// so Java does recognize them as equal
        
        if (str2 == str3)
        {
            System.out.println("str2 and str3 refer to the same object");
        }
        // this does not execute
        /// str2 and str3 store different hex addresses
        /// (unlike str2 and str1)
        
        if (str1.equals(str2) && str2.equals(str3))
        {
            System.out.println("str1, str2, and str3 are equal");
        }
        /// this executes
        
        if ((str1 == str2) && (str2 == str3))
        {
            System.out.println("str1, str2, and str3 are the same objects");
            
        }
        /// this does not execute
        /// str1 does "==" str2 (they store the same address)
        /// str2 does not == str3 (they store different addresses)
        
    }
}
