
public class Tank extends Forces{
    
    
    public Tank(int health){
        super(health);
        super.setName(super.getName()+"T");
    }
    
    @Override
    public void doAction1(){
        
    }
    
    @Override
    public void decreaseHealth(){
        super.decreaseHealth();
        
    }
    
}
