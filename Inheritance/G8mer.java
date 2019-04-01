public class G8mer extends Person{
    private double winrate;
    private String name;
    private double wealth;
    
    public G8mer(){
        super("default");
    }
    
    public G8mer(String name){
        super(name);
    }
    
    public void setScore(double winrate){
        this.winrate = winrate;
    }
    
    public double getScore(){
        return winrate;
    }
    
    public void setWealth(double wealth){
        this.wealth = wealth;
    }
    
    public double getWealth(){
        return wealth;
    }
    
    public String toString(){
        String out = super.toString();
        out += "---> Gamer";
        out += "---> \nScore" + winrate + "\n";
        return out;
    }

}