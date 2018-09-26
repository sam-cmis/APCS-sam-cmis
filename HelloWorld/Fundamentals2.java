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


}