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
                System.out.println(arr[x]);
                x += 2;
            }
        }

        if (skip == false){
            while (y < arr.length){
                System.out.println(arr[y]);
                x += 1;
            }
        }
    }

    public static void printArray(double[]arr, boolean skip){
        int x = 0;
        int y = 0;
        if (skip == true){
            while (x < arr.length){
                System.out.println(arr[x]);
                x += 2;
            }
        }

        if (skip == false){
            while (y < arr.length){
                System.out.println(arr[y]);
                x += 1;
            }
        }
    }

    public static void printArray(String[]arr, boolean skip){
        int x = 0;
        int y = 0;
        if (skip == true){
            while (x < arr.length){
                System.out.println(arr[x]);
                x += 2;
            }
        }

        if (skip == false){
            while (y < arr.length){
                System.out.println(arr[y]);
                x += 1;
            }
        }
    }

    public static void printArray(boolean[]arr, boolean skip){
        int x = 0;
        int y = 0;
        if (skip == true){
            while (x < arr.length){
                System.out.println(arr[x]);
                x += 2;
            }
        }

        if (skip == false){
            while (y < arr.length){
                System.out.println(arr[y]);
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
        if (array.length % 2 != 0){
            double x = array[array.length / 2];  
            return x;
        }
        else{double x = array[(array.length / 2)-1];
            return x;
        }
    }

    public static String middleitem (String[] array){
        if (array.length % 2 != 0){
            String x = array[array.length / 2];  
            return x;
        }
        else{String x = array[(array.length / 2)-1];
            return x;
        }
    }

    public static boolean middleitem (boolean[] array){
        if (array.length % 2 != 0){
            boolean x = array[array.length / 2];  
            return x;
        }
        else{boolean x = array[(array.length / 2)-1];
            return x;
        }
    }

    public static int middleitem (int[] array){
        if (array.length % 2 != 0){
            int x = array[array.length / 2];  
            return x;
        }
        else{int x = array[(array.length / 2)-1];
            return x;
        }
    }

    public static int[] randomints(int n, int min, int max){
        int [] array = new int[n];
        for (int x = 0; x < n; x++){
            int randomNum = (int)(Math.random() * ((max)-min)+min);
            array[n] = randomNum;
        }
        return array;
    }

    public static double[] randomDoubles(int n, double min, double max){
        double [] array = new double[n];
        for (int x = 0; x < n; x++){
            double randomNum = (double)(Math.random() * ((max)-min)+min);
            array[n] = randomNum;
        }
        return array;
    }

    public static int[] copy(int[] array){
        int [] friendship = array;
        return friendship;
    }

    public static double[] copy(double[] array){
        double [] friendship = array;
        return friendship;
    }

    public static boolean[] copy(boolean[] array){
        boolean [] friendship = array;
        return friendship;
    }

    public static String[] copy(String[] array){
        String [] friendship = array;
        return friendship;
    }

    public static int[] pairs(int n){
        int [] array = new int[n*2];
        int x = 1;
        int y = 0;
        while (y < n*2){
            array[y] = x * 2;
            array [y + 1] = x *2;
            x += 1;
            y += 2;

        }
        return array;
    }

    public static int[] concat(int[] a, int[] b){
        int x = (a.length + b.length);
        int [] array = new int [x];
        int y = 0;
        int z = 0;
        while (y<((a.length + b.length))){
            if (y < a.length){
                array[y] = a[y];
            }
            else if (x>=a.length -1){
                array[x] = b[z];
                z+=1;
            }
            x+=1;
            y+=1;
        } 
        return array; 
    }

    public static int[] merge(int[] a, int[] b){
        int [] array = new int [(a.length + b.length)];
        int y = 0;
        int z = 0;
        int x = 0;
        if (a.length <= b.length){
            int little = a.length;
            int big = b.length;
            int large [] = a;
            int smaller [] = b;
        }
        else{
            int big = a.length;
            int little = b.length;
            int smaller [] = a;
            int large [] = b;
        }
        while (x < array.length){
            if (y>=a.length){
                array [x] += b [z];
                z += 1;
                x+=1;
            }
            else if (z>=b.length){
                array [x] += a [z];
                z += 1;
                x+=1;
            }
            else {
                array [x] += a [z];
                array [x+1] += b[z];
                z+=1;
                x+=2;
            }
            y +=1;
        }
        return array; 
    }

    public static int[]  reverse(int[] array){
        for(int i = 0; i < array.length / 2; i++)
        {
            int x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }
        return array;
    }
    
    public static int[] subArray(int[] array, int start, int stop){
        int[] output = new int[stop - start]; 
        int a = 0; 
        for (int i = start; i < stop; i++){
            output[a] = array[i]; 
            a++; 
        }
        return output; 
    }
    
        public static int[] compareArrays(int[] a, int[] b){
        int sum1 = 0; 
        int sum2 = 0; 
        for(int i = 0; i < a.length; i++){
            sum1 += a[i]; 
        }
        for(int j = 0; j < b.length; j++){
            sum2 += b[j]; 
        }
        if (sum1 >= sum2){
            return a;
        }else
            return b; 
    }

    public static double[] maxMerge(double[] a, double[] b){
        double[] output = new double[0];
        int same = 0;
        int k = 0; 
        if (a.length >= b.length){
            same = b.length; 
            output = a;
        }else {
            same = a.length; 
            output = b;
        }
        for (int i = 0; i < same; i++){
            if(a[i] > b[i]){
                output[i] = a[i];
            }else{
                output[i] = b[i]; 
            }
        }
        return output;
    }
}