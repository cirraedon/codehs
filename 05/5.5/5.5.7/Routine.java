public class Routine
{
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    public Routine(double school, double sleep, double friends, double hobbies) {
        this.school = school;
        this.sleep = sleep;
        this.friends = friends;
        this.hobbies = hobbies;
    }
    
    public Routine() {
        // asdkblfjhslcaksjdshbcakljbfhalkdjfhlkahfakljhrioequahrdflzknadlkjgnakdjhradlkfbnhkljhgediflbzknbksdfjhadlkriuyhopadjzfk;lkhjgioealrojkef;qjopai
    }
    
    ///getter methods
    
    public double getSchool() {
        return school;
    }
    
    public double getSleep() {
        return sleep;
    }
    
    public double getFriends() {
        return friends;
    }
    
    public double getHobbies() {
        return hobbies;
    }
    
    
    ///setter methods
    
    public void setSchool(double school) {
        this.school = school;
    }
    
    public void setSleep(double sleep) {
        this.sleep = sleep;
    }
    
    public void setFriends(double friends) {
        this.friends = friends;
    }
    
    public void setHobbies(double hobbies) {
        this.hobbies = hobbies;
    }
    
    
    /// that one other method
    
    public void printTotal() {
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + (school*7));
        System.out.println("Sleeping: " + (sleep*7));
        System.out.println("With Friends: " + (friends*7));
        System.out.println("Doing fun stuff: " + (hobbies*7));
        System.out.println("You're busy " + ((school+sleep+friends+hobbies)*7) + " hours a week!");
    }
}