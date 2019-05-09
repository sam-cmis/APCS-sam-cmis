public class TongkaDumptruck implements Drivable, Flyable, Readable{
    private double weight;
    private int cost;
    
    public TongkaDumptruck(){
        weight = 420.74;
        cost = 9;
    }
    
    public int speed(){
        return 1;
    }

    public void name(String name){
        
    }
    
    public int height(){
        return 1;
    }
    
    public void destination(int x, int y){}
    
    public String words(){
        return "d";
    }
    
    public void changeBook(String newTitle,int newNum){}
    
}