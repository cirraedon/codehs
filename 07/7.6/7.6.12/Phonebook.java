import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
    public void addContact(Contact c) { 
        contacts.add(c);
        
        alphabeticSort(contacts);
    }


    public static void  alphabeticSort ( ArrayList < Contact > cs )
    {
        int i = 1 , j;
        Contact key = new Contact ( );
        ArrayList < Contact > inputArray = cs;

        for ( j = 1 ; j < inputArray.size ( ) ; j ++ )
        {
            key = inputArray.get ( j );
            i = j - 1;
            
            while ( i >= 0 )
            {
                if ( key.getName ( ).compareTo ( inputArray.get ( i ).getName ( ) ) > 0 )
                {
                    break;
                }
                
                Contact element = inputArray.get ( i + 1 );
                inputArray.set ( i + 1 , inputArray.get ( i ) );
                inputArray.set ( i , element );
                i -- ;
            }
        }
    }
        
    public void printPhonebook() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName());
        }
    }
        
}
