import java.util.Scanner;
public class checkerboard{
  public static void main (String[] args){
      Scanner Scan = new Scanner (System.in);
      int in_1 = Scan.nextInt();
      int in_2 = Scan.nextInt();
      System.out.println(checkerboard(in_1, in_2));
      
    }
      
    public static String checkerboard(int w, int h) {
   String output = "";
   String mid = "";
   for (int a = 0; a <= h+1; a++){
       if (a == 0){
      for (int c = 0; a <= h + 1; a++){
          mid += "-";
        }
      output += "+" + mid + "+";
      }else{
     for (int b = 0; b < w; b++){
            output += ","; 
        }
    }
    output += "\n";
   }
   return output;
  }
}
