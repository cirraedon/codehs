public class Fraction
{
    private int n;
    private int d;
    
    public Fraction(int n, int d)
    {
        this.n = n;
        this.d = d;
    }
    
    // Returns the numerator
    public int getNumerator()
    {
        return n;
    }
    
    // Returns the denominator
    public int getDenominator()
    {
        return d;
    }
    
    public Fraction sumFractions(Fraction f) {
        return new Fraction(n*f.getDenominator() + d*f.getNumerator(), d*f.getDenominator());
    }
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return n + "/" + d;
    }
    
    
}