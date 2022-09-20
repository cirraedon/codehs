import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the latitude of the starting location: ");
        double sLatitude = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double sLongitude = scanner.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double eLatitude = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double eLongitude = scanner.nextDouble();
        
        GeoLocation GL1 = new GeoLocation(sLatitude, sLongitude);
        GeoLocation GL2 = new GeoLocation(eLatitude, eLongitude);
        
        System.out.println("The distance is " + GL1.distanceFrom(GL2) + " miles.");
    }
}