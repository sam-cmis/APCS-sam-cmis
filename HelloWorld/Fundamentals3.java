public class Fundamentals3 {
    public static void main(String[] args){
        int[][] array_1 = new int[5][5];
        int[][] array_2 ={{4,9,1,9,2},{4,5,6,7,3},
                {1,5,3,9,2},{5,3,4,6,9},{6,9,7,4,3}};
        double[][] array_3 = new double[4][4];
        double[][] array_4 = {{4,5,6,7,8},{5,3,2,4,5,},{7,8,9,1,2,},{1,2,3,4,5,},{3,4,5,6,7,}};
        String[][] please = {{" ","#"," ","#"," ","#"," ","#"},{" ","#"," ","#","#"," ","#"," "}
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
        int z = 0;
        if (rowMajor == true){
            while (y < array.length){
                for (int x =0; x < array[0].length; x++){
                    System.out.print(array[y][x] + " ");

                } 
                y++;
                System.out.print("\n"); 
            }
        }

        else if (rowMajor == false)
        {
            while (z < array.length){
                for (int a =0; a < array[0].length; a++){
                    System.out.print(array[a][z] + " ");
                }
                z++;
                System.out.print("\n");
            }   
        }
    }

    public static void snakePrint(int[][] arr){
        for (int x = 0; x < arr.length; x++){
            if (x % 2 == 0){
                for (int y=0; y < arr[x].length; y++){
                    System.out.print(arr[x][y] + " ");
                }
            }
            else {
                for (int k = arr[x].length -1; k >= 0; k--){
                    System.out.print(arr[x][k] + " ");
                }
            }
        }
    }

    public static String[][] locate(String[][] arr){
        int y = (int)(Math.random() * (arr.length));
        int x = (int)(Math.random() * (arr[0].length));
        int number = (int)(Math.random() * (10));
        String s = "" + number;
        for (int k = 0; k < arr.length; k++){
            for (int j = 0; j < arr[0].length; j++){
                if (k == y && j == x){
                    arr[k][j] = s;
                }
            }
        }
        return arr;
    }

    public static int[][] replace(int[][] array, int threshold, int newValue){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] > threshold){
                    array [i][j] = newValue; 
                }
            }
        }
        return array; 
    }

    public static double[][] shift(double[][] arr, int row){
        double [][] output = new double [arr.length][arr[0].length]; 
        for (int b = 0; b < arr.length; b++){
            if (b < row){
                output[b] = arr[b]; 
            }else if(b >= row && b != arr.length -1){
                output[b+1] = arr[b]; 
            }
        }
        for (int c = 0; c < arr[0].length; c++){
            output[row][c] = Math.random() * 10; 
        }
        return output; 
    }

    public static double[][] tilt(double[][] arr){
        double[][] output = new double [arr[0].length][arr.length]; 
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[0].length; b++){
                output[b][a] = arr[a][b]; 
            }
        }
        return output; 
    }

    public static int[][] greatestsum (int[][] arr){
        int x = 0;
        int y = 0;
        int r = 0;
        int z = 0;
        for (int s = 0; s < arr.length; s++){
            for (int h = 0; h < arr[0].length; h++){
                x += arr[h][s];
            }
            for (int w = 0; w < arr.length; w++){
                r += arr[s][y];
            }
            if (x < r){
                
            }
            else if (r > x){
                
            }
        }
        return array;
    }
}
