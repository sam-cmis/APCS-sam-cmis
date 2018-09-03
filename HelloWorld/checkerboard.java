public class checkerboard{
    public static void checkerboard(int w, int h) {
        String output = "";
        String mid = "";
        String mid2 = "";
        for (int a = 0; a <= h+1; a++){
            if (a == 0){
                for (int c = 0; c < w; c++){
                    mid += "-";
                }
                output += "+" + mid + "+";
            }
            else if (a == h+1){
                for (int d = 0; d < w; d++){
                    mid2 += "-";
                }
                output += "+" + mid2 + "+";
            }
            else{
                for (int b = 0; b < w; b++){
                    output += "#"; 
                }
            }
            for (int lup = h; h>0; h--)
            {
             System.out.print("|");
             for (int looptime = w; w > 0; w--)
             {
                System.out.print(".");
                if (w==1){
                 System.out.print("| \n");
                }
                }
            }
            output += "\n";
        }
        return output;
    }
}
