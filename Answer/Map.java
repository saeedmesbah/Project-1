
public class Map {
    
    private String[] map;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Map(){
        map=new String[124];
        for(int i=0;i<124;i++){
            map[i]=""+i;
        }
        map[120]="4B";
        map[108]="4A";
    }
    
    public void drawMap(){
        moveLocation("4A","U");
        moveLocation("4A","U");
        
        drawHexagon();
        calculateDistance();
    }
    
    public void drawHexagon(){
        int in=1;
        for(int i=0;i<37;i++){
            
            if(i%4==0){
                System.out.print("  ");
                for(int j=0;j<13;j++){
                    if(j%2==0){
                        System.out.print("* * *");
                    }
                    else{
                        if(map[in].length()<2){
                            System.out.print("    "+map[in]+"    ");
                            in++;
                        }
                        else if(map[in].length()<3){
                            System.out.print("    "+map[in]+"   ");
                            in++;
                        }
                        else{
                            System.out.print("   "+map[in]+"   ");
                            in++;
                        }
                    }     
                }
                System.out.println("");
            }
            
            if(i%4==1){
                System.out.print(" ");
                for(int j=0;j<13;j++){
                    if(j%2==0){
                        System.out.print("*     *");
                    }
                    else{
                        System.out.print("       ");
                    }
                }
                System.out.println("");
            }
            
            if(i%4==2){
                for(int j=0;j<13;j++){
                    if(j%2==0){
                        if(map[in].length()<2){
                            System.out.print("    "+map[in]+"    ");
                            in++;
                        }
                        else if(map[in].length()<3){
                            System.out.print("    "+map[in]+"   ");
                            in++;
                        }
                        else{
                            System.out.print("   "+map[in]+"   ");
                            in++;
                        }
                    }
                    else{
                        System.out.print("* * *");
                    }
                }
                System.out.println("");
            }
            
            if(i%4==3){
                System.out.print(" ");
                for(int j=0;j<13;j++){
                    if(j%2==0){
                        System.out.print("*     *");
                    }
                    else{
                        System.out.print("       ");
                    }
                }
                System.out.println("");
            }
            
        }
    }
    
    
    public void moveLocation(String componentName,String direction){
        int hold,a=calculateIndex(componentName);
        
        if(direction.equals("U")){
            hold=a-13;
            if(map[hold].equals(""+hold)){
                map[hold]=componentName;
                map[a]=""+a;
            }
        }
        
        if(direction.equals("D")){
            hold=a+13;
            if(map[hold].equals(""+hold)){
                map[hold]=componentName;
                map[a]=""+a;
            }
        }
        
        if(direction.equals("UR")){
            hold=a-6;
            if(map[hold].equals(""+hold)){
                map[hold]=componentName;
                map[a]=""+a;
            }
        }
        
        if(direction.equals("UL")){
            hold=a-7;
            if(map[hold].equals(""+hold)){
                map[hold]=componentName;
                map[a]=""+a;
            }
        }
        
        if(direction.equals("DR")){
            hold=a+7;
            if(map[hold].equals(""+hold)){
                map[hold]=componentName;
                map[a]=""+a;
            }
        }
        
        if(direction.equals("DL")){
            hold=a+6;
            if(map[hold].equals(""+hold)){
                map[hold]=componentName;
                map[a]=""+a;
            }
        }
        
    }
    
    public void setComponent(int index,String componentName){
        int a=calculateIndex(componentName);
        map[index]=componentName;
        map[a]=""+a;
        
    }
    
    public int calculateIndex(String componantName){
        for(int i=1;i<124;i++){
            if(map[i].equals(componantName)){
                return i;
            }
        }
        return 0;
    }
    
    public void calculateDistance(){
        int a=calculateIndex("4A");
        int b=calculateIndex("4B");
        int max=0,min=0,distance;
        
        if(a>b){
            max=a;
            min=b;
        }
        if(a<b){
            max=b;
            min=a;
        }
        distance=max-min;
        
        if(distance%13==0){
            System.out.println(distance/13);
        }
        
        else if(distance%7==0){
            System.out.println(distance/7);
        }
        
        else if(distance%6==0){
            System.out.println(distance/6);
        }
        
        else if(distance%25==0){
            System.out.println(distance/25+2);
        }
        
        else if(distance%12==0){
            System.out.println(distance/12);
        }
        
        else if(distance%14==0){
            System.out.println(distance/14);
        }
        
        else if(distance%19==0){
            System.out.println(distance/19+1);
        }
        
        else if(distance==1){
            System.out.println(distance);
        }
        
        
    }
    
    public void setBorde(int location,String name){}
    
    
}
