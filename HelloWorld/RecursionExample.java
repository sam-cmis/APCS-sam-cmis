public class RecursionExample{
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
        if (a <= b){
            return 0;
        }
        else if (a == b){
            return 1;
        }
        else if (b == 1){
            return a;
        }
        else{
             return 1 + divide((a - b),b);
        }
    }
    
    public static int power(int a, int b){
        if (b == 0)
        {
            return 1;
        }
        else if (b == 1)
        {
            return a;
        }
        else
        {
            return multiply(a, power(a,b-1));
        }
    }
}

