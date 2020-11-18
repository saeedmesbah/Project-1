
import java.util.*;

public class Organizer {
    

    Player play1=new Player("Axis");
    
    
    Soldier s1=new Soldier();
    Soldier s2=new Soldier();
    Soldier s3=new Soldier();
    Soldier s4=new Soldier();
    Soldier s5=new Soldier();
    Soldier s6=new Soldier();
    Soldier s7=new Soldier();
    
    Tank t1=new Tank();
    Tank t2=new Tank();
    Tank t3=new Tank();
    Tank t4=new Tank();
    Tank t5=new Tank();
    Tank t6=new Tank();
    
    
    
    Player play2=new Player("Allied");
    
    Soldier s8=new Soldier();
    Soldier s9=new Soldier();
    Soldier s10=new Soldier();
    Soldier s11=new Soldier();
    Soldier s12=new Soldier();
    Soldier s13=new Soldier();
    Soldier s14=new Soldier();
    Soldier s15=new Soldier();
    
    Tank t7=new Tank();
    Tank t8=new Tank();
    Tank t9=new Tank();
    
    Artillery a1=new Artillery();
    Artillery a2=new Artillery();
    
    public Organizer(){
        
        play1.addForses(s1);
        play1.addForses(s2);
        play1.addForses(s3);
        play1.addForses(s4);
        play1.addForses(s5);
        play1.addForses(s6);
        play1.addForses(s7);
        
        play1.addForses(t1);
        play1.addForses(t2);
        play1.addForses(t3);
        play1.addForses(t4);
        play1.addForses(t5);
        play1.addForses(t6);
        
        
        play2.addForses(s8);
        play2.addForses(s9);
        play2.addForses(s10);
        play2.addForses(s11);
        play2.addForses(s12);
        play2.addForses(s13);
        play2.addForses(s14);
        play2.addForses(s15);
        
        play2.addForses(t7);
        play2.addForses(t8);
        play2.addForses(t9);
        
        play2.addForses(a1);
        play2.addForses(a2);
    }
    
    public void game(){
        int counter=0;
        
        while(true){
            if(counter%2==0){
                System.out.println("Allied Start!");
            }
            else{
                System.out.println("Axis Start!");
            }
            
            if(play1.getPoint()==6){
                System.out.println("Axis Win!!!");
                return;
            }
             
            if(play2.getPoint()==6){
                System.out.println("Allied Win!!!");
                return;
            }
             
        }
        
    }
    
}

 