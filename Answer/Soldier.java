
public class Soldier extends Forces{
    
    
    public Soldier(int health){
        super(health);
        super.setName(super.getName()+"S");
    }
    
    
    
    @Override
    public void doAction1(){
        
    }
    
    public void doAction2(){
        
    }
    
    @Override
    public void decreaseHealth(){
        super.decreaseHealth();
    }
    
}
