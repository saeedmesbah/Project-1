
public class Artillery extends Forces{
    
    public Artillery(int health){
        super(health);
    }
    
    @Override
    public void doAction1(){
        
    }
    
    @Override
    public void decreaseHealth(){
        super.decreaseHealth();
        super.setName(super.getName()+"A");
    }
}
