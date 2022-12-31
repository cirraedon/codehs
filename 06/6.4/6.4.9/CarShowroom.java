public class CarShowroom {
    
    public static void main (String[] args) {
        CarShowroom showroom = new CarShowroom(7);
        showroom.spaces[0] = new CarModel("Mustang", 157);
        showroom.spaces[1] = new CarModel("Camaro",155);
        showroom.spaces[3] = new CarModel("Corvette", 194);
        showroom.spaces[6] = new CarModel("Porsche", 210);
        
        // print out what is in the showroom
        System.out.println(showroom);
        
        // test output
        System.out.println("Index of Mustang should be 0 and is " +
                        showroom.findCarSpace("Mustang"));
        System.out.println("Index of Corvette should be 3 and is " +
                        showroom.findCarSpace("Corvette"));
        System.out.println("Index of Miata should be -1 and is " +
                        showroom.findCarSpace("Miata"));
                        
        
        System.out.println("\nOriginal Car Showroom:");
        System.out.println(showroom);
        showroom.consolidate();
        System.out.println("Car Showroom after cars have been consolidated:");
        System.out.println(showroom);
    }
   
    private CarModel[] spaces;

    // constructor for number of spaces in showroom
    public CarShowroom(int numParkingSpaces) {
       spaces = new CarModel[numParkingSpaces];
    }

    // Returns index of space that contains the car with the specified model
    // and -1 if no car in the showroom is that model.No two cars in the showroom are the same model.
    
    public int findCarSpace(String car) {
        for (int i = 0; i<spaces.length; i++) {
            if (spaces[i] != null && spaces[i].getName().equals(car)) {
                return i;
            }
        }
        
        return -1;
    }

    public int findFirstNull() {
        for (int i=0;i< spaces.length;i++) {
            if (spaces[i] == null) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int findFirstCarAfterNull() {
        boolean nullPassed = false;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                nullPassed = true;
            }
            if (spaces[i] != null && nullPassed) {
                return i;
            }
        }
        
        return -1;
    }

    public void consolidate() { 
        while (findFirstCarAfterNull() != -1) {
            int fidx = findFirstNull();
            int cidx = findFirstCarAfterNull();
            
            spaces[fidx] = spaces[cidx];
            spaces[cidx]=null;
        }
    }

    public String toString() {
        String result = "";
        CarModel sp = null;
        
        // iterate through the spaces
        for (int i = 0; i < spaces.length; i++) 
        {
        sp = spaces[i];
        result = result + "Space " + i + " has a ";
        
        // locate empty spaces
        if (sp == null)
        {
            result = result + " null \n";
        }
        else result = result + sp.toString() + "\n";
        }
        return result;
    }
}
