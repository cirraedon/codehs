public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       
        Coins coins = new Coins(3, 2, 1, 4);
        coins.addQuarter();
        coins.addQuarter();
        coins.addDime();
        coins.addPenny();
        coins.addPenny();
        coins.addPenny();
        
        coins.bankCount();
        coins.bankValue();
    }
}