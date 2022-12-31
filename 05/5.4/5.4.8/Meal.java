public class Meal
{
    private String name;
    private String course;
    private int servings;
    
    public Meal(String name, String course, int servings) {
        this.name = name;
        this.course = course;
        this.servings = servings;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public int getNumberOfServings() {
        return this.servings;
    }
    
    public String toString() {
        return name + " (" + course + ")";
    }
}