public class HelloWorld
    {
    public static void main ( String args[] )
        {
        System.out.println( "Hello DOMINIC!" );
        byte n =0b00101101;
        System.out.println(n);
        } //end method main 
    
    public static double getRandomDoubleBetweenRange(double min, double max){
    double x = (Math.random()*((max-min)+1))+min;
    return x;
 }
    } // end class HelloWorld
    