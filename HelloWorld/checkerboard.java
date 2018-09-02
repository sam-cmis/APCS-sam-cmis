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
   String mid2 = "";
   for (int a = 0; a <= h+1; a++){
       if (a == 0){
      for (int c = 0; c <= w; a++){
          mid += "-";
        }
      output += "+" + mid + "+";
      }
      else if (a == h+1){
        for (int d = 0; d < w; d++){
         mid2 += "-";
        }
    }
      else{
     for (int b = 0; b < w; b++){
            output += ","; 
        }
     if (b == 0 || b == w +1){
        output += "|";
        }
     else if ( (b+a) % 2 == 0) {
        while ((roll + column) % 2 != 0){
          roll = (int)(Math.random() * ((h - 1) + 1)) + 1;
          column = (int)(Math.random() * ((w - 1) + 1)) + 1;
        }
        if (a == roll && b == column){
            output += num;
        }else{
            output += "#";
        }
        }else if ( (b+a) % 2 == 1){
        output += " ";
        }
    }
    output += "\n";
   }
   return output;
  }
}
