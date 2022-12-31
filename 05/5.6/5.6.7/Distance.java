public class Distance
{
    private double km;
    private double miles;
    private double leagues;
    
    public Distance(double km) {
        this.km = km;
    }
    
    public double toMiles() {
        miles = km/1.609;
        return miles;
    }
    
    public double toLeagues() {
        leagues = km/5.556;
        return leagues;
    }
    
    public double doubleMiles() {
        return 2*miles;
    }
    
    public double getKilometers() {
        return km;
    }
}