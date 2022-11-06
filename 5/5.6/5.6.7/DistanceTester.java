public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance w = new Distance(12.13542);
        Distance t = new Distance(45.1526434);
        Distance b = new Distance(8765.12345);
        
        // Convert one to miles, one to leagues and
        // double one mileage
        double wMiles = w.toMiles();
        double tLeags = t.toLeagues();
        double bRndTp = b.doubleMiles();
        
        
        // Print out the converted values
        // Use the getter!
        System.out.println(""+w.getKilometers() + " km = " + wMiles + " miles");
        System.out.println(""+t.getKilometers() + " km = " + tLeags + " leagues");
        System.out.println(""+b.getKilometers() + "km (one way) = " + bRndTp + " miles (round trip)");
    }
}