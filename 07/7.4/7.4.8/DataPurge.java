import java.util.ArrayList;
import java.lang.String;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> al) {
        for (int i = al.size()-1; i>0; i--) {
            if (al.indexOf(al.get(i)) != i) {
                System.out.println(al.get(i));
                al.remove(i);
            }
        }
    }
    
    public static void removeName(ArrayList<String> al, String name) {
        for (int i = al.size()-1; i >=0; i--) {
            if (al.get(i).toUpperCase().contains(name.toUpperCase()) ) {
                System.out.println(al.get(i));
                al.remove(i);
            }
        }
    }
    
    public static boolean correctlyFormatted(ArrayList<String> al) {
        for (String name : al) {
            String[] flname = name.split(" ");
            if (flname.length != 2) {
                return false;
            }
            
            if (flname[0].toUpperCase().charAt(0) != flname[0].charAt(0) || flname[1].toUpperCase().charAt(0) != flname[1].charAt(0)) {
                return false;
            }
        }
        
        return true;
    }
}
