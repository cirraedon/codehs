import java.lang.StringBuilder; /// THIS IS SO TROLL

public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int level, String attack) {
        this.level = level;
        this.attack = attack;
    }
    
    // Put getters here
    public String getAttack() {
        return this.attack;
    }
    
    public int getLevel() {
        return this.level;
    }
    
    // Put other methods here
    public String fight() {
        StringBuilder sb = new StringBuilder(level*this.attack.length());
        for (int i = 0; i < level; i++) {
            sb.append(attack);
        }
        return sb.toString();
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}