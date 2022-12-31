public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
        Student bestStudent = null;
        int highest = Integer.MIN_VALUE;
        
        for (Student student : students) {
            if (student != null && student.getExamImprovement() > highest) {
                highest = student.getExamImprovement();
                bestStudent = student;
            }
        }
        
        return bestStudent;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
