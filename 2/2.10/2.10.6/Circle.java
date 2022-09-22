import java.lang.Math;

public class Circle
{
    private double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }
    
    // Implement getSphereVolume using
    // Math.PI and
    // Math.pow
    // Volume = 4/3 * pi * r^3
    public double getSphereVolume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    
    
}