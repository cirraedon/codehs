public class Chef
{
    private String name;
    private String restaurant;
    private Meal bestMeal;
    
    public Chef(String name, String restaurant, Meal bestMeal) {
        this.name = name;
        this.restaurant = restaurant;
        this.bestMeal = bestMeal;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getRestaurant() {
        return this.restaurant;
    }
    
    public String getMealName() {
        return this.bestMeal.getName();
    }
    
    public int getMealServings() {
        return this.bestMeal.getNumberOfServings();
    }
    
    public String getMealCourse() {
        return this.bestMeal.getCourse();
    }
    
    public String toString() {
        return "Chef " + this.name + " works at " + this.restaurant + " and is best known for " + this.bestMeal;
    }
}