public class Thing {
    private int field1 = 10;
    private double field2 = 4.3;
    private boolean field3 = false;
    private String field4 = "no, hi, bye";
    
    public Thing(){
        this. field1 = 690;
        this. field2 = 74.0;
        this. field3 = false;
        this. field4 = "please no";
    }
    
    public Thing(int field1value){
       this();
        this. field1 = field1value;
    }
    public void setfield1(int newvalue){
        this.field1 = newvalue;
    }
    
    public void setfield2(double newvalue){
        this.field2 = newvalue;
    }
    
    public void setfield3(boolean newvalue){
        this.field3 = newvalue;
    }
    
    public void setfield4(String newvalue){
        this.field4 = newvalue;
    }
    
    public int getfield1(){
        return field1;
    }
    
    public double getfield2(){
        return field2;
    }
    
    public boolean getfield3(){
        return field3;
    }
    
    public String getfield4(){
        return field4;
    }
}


