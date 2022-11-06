public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car wtb = new Car(20.0, 15.0);
        //Fill up the gas tank
        wtb.addGas();
        //Check the miles available
        System.out.println("Miles available: " +wtb.milesAvailable());
        //Drive 100 miles
        wtb.drive(100.0);
        //Check the miles available
        System.out.println("Miles available: " +wtb.milesAvailable());
        //Add 2 gallons to the gas tank
        wtb.addGas(2.0);
        //Check the miles available
        System.out.println("Miles available: " +wtb.milesAvailable());
        //Try driving more miles than available by driving 1000 miles
        wtb.drive(1000);
        //Drive 200 miles
        wtb.drive(200);
        //Check how much gas you have left
        System.out.println("Gas remaining: " +wtb.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " +wtb.getTotalMilesDriven());
    }
}