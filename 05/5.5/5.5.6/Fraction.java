public class Fraction
{
    // Create your instance variables and constructor here
    private int n;
    private int d;
    
    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }
    
    
    
    public int getNumerator() {
        return this.n;
    }
    
    public int getDenominator() {
        return this.d;
    }
    
    public void setNumerator(int n) {
        this.n = n;
    }
    
    
    public void setDenominator(int d) {
        this.d = d;
    }
    
    public void add(Fraction other) {
        if (other.getDenominator() == this.d) {
            this.n = n+other.getNumerator();
        }
        else {
            this.n = this.n*other.getDenominator() + other.getNumerator()*this.d;
            this.d = this.d*other.getDenominator();
        }
    }
    
    public void subtract(Fraction other) {
        if (other.getDenominator() == this.d) {
            this.n = n-other.getNumerator();
        }
        else {
            this.n = this.n*other.getDenominator() - other.getNumerator()*this.d;
            this.d = this.d*other.getDenominator();
        }
    }
    
    public void multiply(Fraction other) {
        this.n = this.n*other.getNumerator();
        this.d = this.d*other.getDenominator();
    }
    
    public String toString() {
        return this.n + " / " + this.d;
    }
}