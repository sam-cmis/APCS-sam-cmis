public class quiz2{
    public static void main(String args[])
    {
        System.out.println (method3(4, 3));
    }

    public static int method1(int a, int b, int c){
        int x = a * b;
        int y = b * c;
        int z = a * c;
        if (x >= y && x >= z)
            return x;
        else if  (y >= x && y >= z)
            return y;
        else
            return z;
    }

    public static int method2(int a, int b){
        int sum = 0;
        for (int posit = 0; posit <= a; posit ++)
        {
            sum += posit;
        }
        int result = sum * b;
        return result;
    }

    public static String method3(int h, int w)
    {
        String result = "";
        if (h % 2 == 1 && w % 2 == 1)
        {
            String resultA = " ";
            String resultB = " ";

            int HB = w/2;
            int hdt = h/2;
            for (int wposit = 0; wposit < w; wposit ++)
                if (wposit == HB)
                {
                    resultA += "|";
                    resultB += "+";
                }
                else 
                {
                    resultA += " ";
                    resultB += "-";
                }
            resultA += "\n";
            resultB += "\n";
            for (int hposit = 0; hposit < h; hposit ++)
                if (hposit == hdt)
                    result += resultB;
                else 
                    result += resultA;
        }
        else
            result = "+";
        return result;
    }
}