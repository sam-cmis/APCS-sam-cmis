public class Fundamentals3 {
    public static void main(String[] args){
        defaultArray(5,5);
    }
    public static int[][] defaultArray (int h, int w){
        int[][] array = new int[h][w];
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                int v = array[y][x];
                
                System.out.print(v + ""); 
            }
        }
        return array;
    }
}
