
import java.util.*;

public class Organizer {
    

    Player play1=new Player("Axis");
    
    
    Soldier s1=new Soldier(4);
    Soldier s2=new Soldier(4);
    Soldier s3=new Soldier(4);
    Soldier s4=new Soldier(4);
    Soldier s5=new Soldier(4);
    Soldier s6=new Soldier(4);
    Soldier s7=new Soldier(4);
    
    Tank t1=new Tank(4);
    Tank t2=new Tank(4);
    Tank t3=new Tank(4);
    Tank t4=new Tank(4);
    Tank t5=new Tank(4);
    Tank t6=new Tank(4);
    
    
    
    Player play2=new Player("Allied");
    
    Soldier s8=new Soldier(4);
    Soldier s9=new Soldier(4);
    Soldier s10=new Soldier(4);
    Soldier s11=new Soldier(4);
    Soldier s12=new Soldier(4);
    Soldier s13=new Soldier(4);
    Soldier s14=new Soldier(4);
    Soldier s15=new Soldier(4);
    
    Tank t7=new Tank(3);
    Tank t8=new Tank(3);
    Tank t9=new Tank(3);
    
    Artillery a1=new Artillery(2);
    Artillery a2=new Artillery(2);
    
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

 
