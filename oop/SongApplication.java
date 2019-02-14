public class SongApplication
{
    private double length = 2.47;
    private boolean isitgood = true;
    private String name = "My City";
    
    public SongApplication(){
        this. length = 2.47;
        this. isitgood = true;
        this. name = "My City";
    }
    
    public SongApplication(double field1, boolean field2, String field3){
        this();
        this. length = field1;
        this. isitgood = field2;
        this. name = field3;
    }
    
    public String toString(){
        return String.format("name: %n\nlength: %f\nisitgood: %s\n", name, length, isitgood);
    }
}