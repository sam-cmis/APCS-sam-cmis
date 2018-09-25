public class Fundamentals2{
    public static void main (String args[]){
        int [] itg = {21, 69, 74, 42, 1};
        double [] dbl = {1.0,2.2,3.8,4.5,5.6};
        String [] str = {"Eggs Benedict", "womble", "soviet", "mamamia", "over"};
        System.out.println(itg[0]);
        System.out.println(dbl[2]);
        System.out.println(str[4]);
    }

    public static void printArray(int[]arr, boolean skip){
        int x = 0;
        int y = 0;
        if (skip == true){
            while (x < arr.length){
                System.out.print(arr[x]);
                x += 2;
            }
        }
        
        if (skip == false){
            while (y < arr.length){
                System.out.print(arr[y]);
                x += 1;
            }
        }
    }
    
    public static int lastitem (int[] array){
        int x = 0;
        x = (array.length - 1);
        return array[x];
    
    }
    
    public static double lastitem (double[] array){
        int x = 0;
        x = (array.length - 1);
        return array[x];
    
    }
    
    public static String lastitem (String[] array){
        int x = 0;
        x = (array.length - 1);
        return array[x];
    
    }
    
    public static boolean lastitem (boolean[] array){
        int x = 0;
        x = (array.length - 1);
        return array[x];
    
    }
    
    public static double middleitem (double[] array){
        int x = 0;
        x = (array.length / 2);
        return array[x];
    }
    
    public static String middleitem (String[] array){
        int x = 0;
        x = (array.length / 2);
        return array[x];
    }
    
    public static boolean middleitem (boolean[] array){
        int x = 0;
        x = (array.length / 2);
        return array[x];
    }
    
    public static int middleitem (int[] array){
        int x = 0;
        x = (array.length / 2);
        return array[x];
    }
    
    public static int[] randomints(int n, int min, int max){
        int [] array = new int[n];
        for (int x = 0; x < n; x++){
         int randomNum = (int)(Math.random() * (max)+min);
         array[n] = randomNum;
        }
        return array;
    }
    
    public static double[] randomDoubles(int n, double min, double max){
        double [] array = new double[n];
        for (int x = 0; x < n; x++){
         double randomNum = (double)(Math.random() * (max)+min);
         array[n] = randomNum;
        }
        return array;
    }
    
    public static int[] copy(int[] array){
    
    }

}