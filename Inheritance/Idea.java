public class Idea extends Entity{
    private int popularity;
    
    public Idea(){
        super("default");
    }
    
    public Idea(String name){
        super(name);
    }
    
    public void setPopularity(int popularity){
        this.popularity = popularity;
    }
    
    public int getPopularity(){
        return popularity;
    }
    
    public String toString(){
        String out = super.toString();
        out += "---> Idea";
        out += "---> \nPopularity" + popularity + "\n";
        return out;
    }
}