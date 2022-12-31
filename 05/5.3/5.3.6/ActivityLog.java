public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /**
    * adds a certain amount of hours to the total hour count
    * 
    * @param  hours   the number of hours to add to the total
    */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
    * adds a certain amount of miles to the total miles count
    * 
    * @param  miles   the number of miles to add to the total
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
    * returns the total mile count
    * 
    * @return  numMiles   the number of miles total
    */
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
    * returns the total hour count
    * 
    * @return  numHours   the number of hours total
    */
    public double getHours() 
    {
        return numHours;
    }
    
}