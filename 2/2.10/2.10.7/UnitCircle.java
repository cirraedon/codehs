public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double angle0 = 0;
        double cosine0 = Math.cos(angle0);
        cosine0 = Math.round(cosine0 * 100) / 100.0;
        double sine0 = Math.sin(angle0);
        sine0 = Math.round(sine0 * 100) / 100.0;
        
        
        double angle1 = Math.PI/2;
        double cosine1 = Math.cos(angle1);
        cosine1 = Math.round(cosine1 * 100) / 100.0;
        double sine1 = Math.sin(angle1);
        sine1 = Math.round(sine1 * 100) / 100.0;
        
        double angle2 = Math.PI;
        double cosine2 = Math.cos(angle2);
        cosine2 = Math.round(cosine2 * 100) / 100.0;
        double sine2 = Math.sin(angle2);
        sine2 = Math.round(sine2 * 100) / 100.0;
        
        System.out.println(angle0 + ": " + cosine0 + ", " + sine0);
        System.out.println(angle1 + ": " + cosine1 + ", " + sine1);
        System.out.println(angle2 + ": " + cosine2 + ", " + sine2);
    }
}