public class Fundamentals3 {
    public static void main(String[] args){
        int[][] array_1 = new int[5][5];
        int[][] array_2 ={{4,9,1,9,2},{4,5,6,7,3},
                {1,5,3,9,2},{5,3,4,6,9},{6,9,7,4,3}};
        double[][] array_3 = new double[4][4];
        double[][] array_4 = {{4,5,6,7,8},{5,3,2,4,5,},{7,8,9,1,2,},{1,2,3,4,5,},{3,4,5,6,7,}};
        String[][] please = {{" ","#","#","#"," ","#"," ","#"},{" ","#","#","#"," ","#"," ","#"}
            ,{" ","#","#","#"," ","#"," ","#"},{" ","#","#","#"," ","#"," ","#"},{" ","#","#","#"," ","#"," ","#"}
            ,{" ","#","#","#"," ","#"," ","#"},{" ","#","#","#"," ","#"," ","#"},{" ","#","#","#"," ","#"," ","#"}};
    }

    public static int ifaequalschoiceloopit (int array[][], int r, int c){
        int i = array[r][c];
        return i;
    }

    public static double ifaequalschoiceloopit (double array[][], int r, int c){
        double i = array[r][c];
        return i;
    }

    public static String ifaequalschoiceloopit (String array[][], int r, int c){
        String i = array[r][c];
        return i;
    }

    public static void setValue(int[][] arr, int r, int c, int v){
        arr[r][c] = v;
    }

    public static void setValue(double[][] arr, int r, int c, double v){
        arr[r][c] = v;
    }

    public static void setValue(String[][] arr, int r, int c, String v){
        arr[r][c] = v;
    }

    public static void print2DArray(int[][] array, boolean rowMajor){
        int y = 0;
        if (rowMajor = true){
            while (y < array.length){
                for (int x =0; x < array[0].length; x++){
                    System.out.println(array[y][x]);
                    y ++;
                } 
            }
        }

    }
}