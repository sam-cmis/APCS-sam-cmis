public class recursionex{
    public static int multiply(int a, int b){
        if (b == 0 || a == 0){
            return 0;
        }
        else if (b == 1){
            return a;
        }
        else{
            return a + multiply(a, b-1);
        }
    }
    
    public static int divide(int a, int b){
        if (a == 0){
            return 0;
        }
        else if (b == 1){
            return a;
        }
        else{
            return a + divide((a - b),b);
        }
        //  7//3
        //4 // 3
        // 1
    }
}
