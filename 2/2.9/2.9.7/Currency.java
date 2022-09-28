import java.lang.Math;

public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        return value.intValue();
        // intValue() truncates the Double and returns the Integer portion
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        Double newVal = value*100;
        // newVal is now the total amount of cents ($12.34 is 1234 cents)
        return newVal.intValue() % 100;
        // remove any full dollars from the cent count (every 100 cents makes a dollar; 
        //                                               remove as many full 100s as possible
        //                                               and the remainder is the original amount of cents)
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + this.getDollars() + "." + this.getCents();
        // "$" + amount of dollars + decimal point + amount of cents
        // just like you'd write out an amount of money on paper
        // a different usable (and cleaner) implementation is to use 
        //                                                      return "$" + value;
        //                                                           but the CodeHS grader checks for usage of the getDollars() and getCents() 
        //                                                           methods in the toString() function
    }
}