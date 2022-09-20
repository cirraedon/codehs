public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        
        int total = 0;
        
        total += minutesToSeconds(hoursToMinutes(hours));
        total += minutesToSeconds(minutes);
        total += seconds;
        
        System.out.println("" + total);
    }
    
    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }
    
    public static int minutesToSeconds(int minutes) {
        return minutes * 60;
    }
}