public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        /// in the problem statement, it says to use the angles 0, 𝜋/2, and 𝜋

        /// an angle of 0
        double angle0 = 0;
        /// unrounded cos(0)
        double cosine0 = Math.cos(angle0);
        /// round cos(0)
        cosine0 = Math.round(cosine0 * 100) / 100.0;
        /// unrounded sin(0)
        double sine0 = Math.sin(angle0);
        /// rounded sin(0);
        sine0 = Math.round(sine0 * 100) / 100.0;
        /// variables are all followed by a "0"
        /// to signify that they are the first 
        /// (zero indexed) group of variables

        
        /// an angle of 𝜋/2
        double angle1 = Math.PI/2;
        /// unrounded cos(𝜋/2)
        double cosine1 = Math.cos(angle1);
        /// round cos(𝜋/2)
        cosine1 = Math.round(cosine1 * 100) / 100.0;
        /// unrounded sin(𝜋/2)
        double sine1 = Math.sin(angle1);
        /// round sin(𝜋/2)
        sine1 = Math.round(sine1 * 100) / 100.0;
        /// variables are all followed by a "1"
        /// to signify that they are the second 
        /// (zero indexed) group of variables


        /// an angle of 𝜋
        double angle2 = Math.PI;
        /// unrounded cos(𝜋)
        double cosine2 = Math.cos(angle2);
        /// round cos(𝜋)
        cosine2 = Math.round(cosine2 * 100) / 100.0;
        /// unrounded sin(𝜋)
        double sine2 = Math.sin(angle2);
        /// round sin(𝜋/2)
        sine2 = Math.round(sine2 * 100) / 100.0;
        /// variables are all followed by a "2"
        /// to signify that they are the third 
        /// (zero indexed) group of variables
        

        /// rounding is done in all three cases because of floating point inaccuracy


        System.out.println(angle0 + ": " + cosine0 + ", " + sine0);
        System.out.println(angle1 + ": " + cosine1 + ", " + sine1);
        System.out.println(angle2 + ": " + cosine2 + ", " + sine2);
    }
}