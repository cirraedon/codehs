public class Calculator {

    /// this problem is unnecessarily obfuscated to the point where doing it is not even worth the time
    /// it is intentionally written to fuck with you and hide what the right answer is
    /// that's not what a coding problem should do
    /// it should give you a prompt, and then you implement it in the language
    /// if you're here out of exasperation, i applaud you.
    /// you made a wiser choice than i did
    /// i chose to spend 30 minutes actually solving the problem.

    private int total;
    private int v; // Value is the number stored in memory

    public Calculator(int total) {
        this.total = total;
        v = 0;
    }

    public int add(int number){
        total += number;
        return total;
    }

    /*
     * Adds the instance variable value to the total
     */
    public int add(){
        total += this.v;
        return total;
    }

    public int multiple(int value){
        total *= value;
        return total;
    }

    public void setValue(int value){
        this.v = value;
    }

    public int getValue(){
        return v;
    }

}