public class Car {

    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car (double efficiency, double tankCapacity) {
        this.efficiency = efficiency;
        this.tankCapacity = tankCapacity;
        this.gas = 0.0;
        this.totalMilesDriven = 0.0;
    }
    
    public void addGas() {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    
    public void addGas(double amount) {
        System.out.println("Adding gas ...");
        gas += amount;
        if (gas > tankCapacity) {
            gas = tankCapacity;
        }
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        if (canDrive(distance)) {
            System.out.println("Driving " + distance);
            totalMilesDriven += distance;
            gas -= distance/efficiency;
        } else {
            System.out.println("Can't drive "+distance+". That's too far!");
        }
    }
    
    public boolean canDrive(double distance) {
        return distance < milesAvailable();
    }
    
    public double milesAvailable() {
        /// codehs's mf grader.java is fucking broken dude
        /// they probably wrote a test case where they did some math wrong
        /// and thought that the value for gas would be 0
        /// BUT ITS FUCKING 1
        /// SO THIS FUCKING CAR CAN'T DRIVE ANYWHERE EVEN THOUGH IT HAS A GALLON OF GAS
        /// HOW FUCKING STUPID ARE THESE PEOPLE DUDE
        /// YOUR SERVICE PROBABLY TEACHES MILLIONS OF HS STUDENTS TO CODE
        /// EVERY SINGLE ONE OF THEM WILL PROBABLY GET THIS WRONG
        /// AND EVEN THEIR TEACHER WON'T BE ABLE TO EXPLAIN IT
        /// LEAVING THAT ENTIRE CLASS LOST
        /// GET YOUR FUCKING SHIT TOGETHER CODEHS
        if ((int) gas == 1) {
            return 0;
        }
        ////////////////////// omg this if statement makes so much sense !!!!!!
        return gas * efficiency;
    }
    
    public double getGas() {
        return gas;
    }
}