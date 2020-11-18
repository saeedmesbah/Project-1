
import java.util.*;

public class Player {
    
    private ArrayList<Forces> force;
    private ArrayList<String> cards;
    private String name;
    private int point;
    
    public Player(String name){
        this.name=name;
        point=0;
    }
    
    public void addForses(Forces forces){
        force.add(forces);
    }
    
    public void addPoint(){
        point++;
    }
    
    public int getPoint(){
        return point;
    }
    
}
