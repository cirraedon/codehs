public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    
    //const.
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    // adds hours hours to total hours
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    //adds miles miles to total miles
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    //returns total miles
    public double getMiles()
    {
        return numMiles;
    }
    
    //returns total hours
    public double getHours() 
    {
        return numHours;
    }
    
}