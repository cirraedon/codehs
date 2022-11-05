public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire=false;
    
    // Write the constructor here!
    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        if (level >= 70) {
            canBreatheFire=true;
        }
    }
    
    // Put getters here
    public String getName() {
        return this.name;
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public boolean isFireBreather() {
        return this.canBreatheFire;
    }
    
    // Put other methods here
    public void attack() {
        if (canBreatheFire) {
            System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
        }
        else {
            System.out.println("~ ~ ~");
        }
    }
    
    public void gainExperience() {
        this.level+=10;
        if(level >=70) {
            this.canBreatheFire=true;
        }
    }
    
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}