
import java.util.*;

public class Forces {
    
    
    private int health;
    private String name;
    
    public Forces(int health){
        this.health=health;
        name=health+"";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    /**
     *
     */
    public void doAction1(){
        
    }
    
    public void decreaseHealth(){
        health--;
        name=health+"";
    }
    
}
