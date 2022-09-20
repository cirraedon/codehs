public class PersonRunner
{
    public static void main(String[] args)
    {
        Person WAM = new Person("Wolfgang Amadeus Mozart", "January 27, 1756");
        Student JNH = new Student("Johann Nepomuk Hummel", "November 14, 1778", 10, 4.0);
        
        System.out.println(WAM.getName() + "\n" + WAM.getBirthday());
        System.out.println(JNH.getName() + "\n" + JNH.getBirthday() + "\n" + JNH.getGrade() + "\n" + JNH.getGpa());
    }
}