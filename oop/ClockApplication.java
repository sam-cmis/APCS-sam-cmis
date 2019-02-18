public class ClockApplication
{
    private double hour = 3;
    private int minute = 4;
    private int second = 7;
    
    public ClockApplication(){
        this. hour = 3;
        this. minute = 4;
        this. second = 7;
    }
    
    public ClockApplication(int field1, int field2, int field3){
        this();
        this. hour = field1;
        this. minute = field2;
        this. second = field3;
    }
    
    public String toString(){
        return String.format("hour: %n\n minute: %f\n second: %d\n", hour, minute, second);
    }
}