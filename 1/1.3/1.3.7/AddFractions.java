public class AddFractions 
{
    public static void main(String[] args)
    {
        int firstNumerator = 14;
        int firstDenominator = 19;
        
        int secondNumerator = 27;
        int secondDenominator = 11;
        
        System.out.println("The numerator of the first fraction is " + firstNumerator + "\nThe denominator of the first fraction is " + firstDenominator + "\nThe numerator of the first fraction is " + secondNumerator + "\nThe denominator of the second fraction is " + secondNumerator + "\nThe sum of " + firstNumerator + "/" + firstDenominator + " + " + secondNumerator + "/" + secondDenominator + " = " + (firstNumerator*secondDenominator + firstDenominator*secondNumerator) + "/" + (firstDenominator*secondDenominator));
    }
}