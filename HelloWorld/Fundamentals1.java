

public class Fundamentals1
{
    public static void main (String args[] ){
        dataTypes();
        
   }
   
   public static void dataTypes(){
       byte a = 100;
       short b = 10000;
       int c = 100000;
       long d = 100000L;
       float e = 234.5f;
       double f = 123.4;
       boolean g = true;
       char h = 'A';
       String i = "A byte can store the number of toes, fingers, and discount value ";
       String j = "A short can store the number of lego, most expensive lego brick, and a haircut";
       String k = "A int can store the number of the price of lego minifigures,a dog, and a laptop";
       String l = "A long can store the number of the length of solar system in nanometers, biggest star we know in micrometers, mass of moon";
       String m = "A float can store the length of 1000000 lightyears in cm, the milky way in nanometers, and the  biggest blackhole in milimeters";
       String n = "A double can store the length of 100000000 lightyears in cm, the known universe in cm, and 1 quintillion Jeff Bezo's net worth";
       String o = "A boolean can represent that every living thing will die eventually, life is suffering, and rocks are alive";
       String p = "A char can store the number of the price of keyboards, price of mouse, and coffee";
       System.out.format("Example data types: %n byte :%d%n short :%d%n int :%d%n long :%d%n float :%f%n double :%f%n boolean :%s%n char :%s", a,b,c,d,e,f,g,h);
    }
   
   
   public static double add(double a, double b){
    double add = a + b;
    return add;
    }  
   
   public static double sub(double a, double b){
    double sub = a - b;
    return sub;
    }
   
   public static double mul(double a, double b){
    double mul = a * b;
    return mul;
    }
   
   public static double div(double a, double b){
    double div = a / b;
    return div;
    }
   
   public static int add(int a, int b){
    int add = a + b;
    return add;
    }  
   
   public static int sub(int a, int b){
    int sub = a - b;
    return sub;
    }
   
   public static int mul(int a, int b){
    int mul = a * b;
    return mul;
    }
   
   public static int div(int a, int b){
    int div = a / b;
    return div;
    }
    
   public static void math(){
    System.out.println(add(69,74));
    System.out.println(mul(69,74));
    }

}
