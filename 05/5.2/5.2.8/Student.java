public class Student
{
    private String fName;
    private String lName;
    private int grade;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
     public Student(String fName, String lName, int grade, String school) {
        this.fName = fName;
        this.lName = lName;
        this.grade = grade;
        this.school = school;
     }
     
     public Student(String fName, String lName, int grade) {
         this.fName = fName;
         this.lName = lName;
         this.grade = grade;
         
         if(grade >= 9 && grade <= 12) {
             this.school = "high school";
         }
         else if (grade >= 6 && grade <= 8) {
             this.school = "middle school";
         }
         else {
             this.school = "elementary school";
         }
     }
   
   
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return fName + " " + lName + " is in grade " + grade + " and goes to " + school;
    }
    
    public String getFirstName(){
        return fName;
    }
}