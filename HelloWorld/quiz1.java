public class quiz1{
    public static void main(String args[]){

    }
// 1 / 6
    public static void method1(int a, int b, int c){
        if ( a < b){
            if ( b < c){
                System.out.println(b * c);
            }
            else if ( c < a){
                System.out.println(a * b);
            }
            else  {
                System.out.println(c * a);
            }
        }
    }
// 1 / 6
    public static void method2(int a, int b){
        if 
    }
//1
    public static void method3(int h, int w){
        String mid = "";
        String mid2 = "";
        for (int x = 1; x <= w; x++)
        {
            mid += ("|");
        }
        System.out.print(mid + "\n");
        for(int y = 0; y < h; y++){
            System.out.print("-");
            for (int x = 0; x < w; x++){
                if (y % 2 != 0){
                    System.out.print("-");
                }
                else if (y % 2 = 0){
                    System.out.print("+");
                }
            }

        }
    }
    for (int x = w; x > 0; x--)
    {
        mid2 += ("|");
        if (x == 1){
            System.out.print(mid2 + "\n");
        }
    }
}
}   