public class checkerboard
{
    public static void checkerboard(int h, int w){
        System.out.print("+");
        int width = w;

        for (int looptime = w; w > 0; w--)
        {
            System.out.print("-");
            if (w == 1){
                System.out.print("+ \n");
            }
        }
        w = width;
        //^^^^top boarder ^^^^^
        for(int luptime = h; h>0; h--)
        {
            Ssytem.
            System.out.print("#");
            if (h % 2 != 0){
                for (int looptime = w; w > 0; w--)
                {
                    System.out.print("#");
                    if (w == 1){
                        System.out.print("| \n");
                    }

                }
                w = width;        
            }
        }

        
        //^^^mid part^^^
        w = width;
        System.out.print("+");
        for (int looptime = w; w > 0; w--)
        {
            System.out.print("-");
            if (w == 1){
                System.out.print("+ \n");
            }
        }
        //^^^Bottom part^^^     
        if (w == width - 1){
         String Right = "|\n";
         
        }
        
    }
}