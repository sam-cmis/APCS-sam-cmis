public class Mall extends Place{
    private int visitors;
    private double loss;
    
    public Mall(){
        super("default");
    }
    
    public Mall(String name){
        super(name);
    }
    
    public void setVisitors(int visitors){
        this.visitors = visitors;
    }
    
    public int getVisitors(){
        return visitors;
    }
    
    public void setLoss(double loss){
        this.loss = loss;
    }
    
    public double getLoss(){
        return loss;
    }
    
    public String toString(){
        String out = super.toString();
        out += "---> Mall";
        out += "---> \nVisitors" + visitors + "\n";
        return out;
    }
}