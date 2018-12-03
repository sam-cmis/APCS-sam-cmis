public class Repack
{

    public static void main(String[] args){
        int[][] array = getArray(5, 5, true);
        print(array);
        print(repack(array, 3));
    }

    public static int[][] repack(int[][] array, int w){
        int arr = array.length * array[0].length;
        int h = (arr / w) + (arr % w == 0 ? 0 : 1);

        int[][] repacked = new int[h][w];
        int y = 0, x = 0;
        for(int a = 0; a < repacked.length; a++){
            for(int b = 0; b < repacked[0].length; b++)
            {}
        }
        return repacked;
    }

    public static int[][] getArray(int h, int w, boolean random){
        int[][] array = new int[h][w];
        int ct = 0;
        for(int y = 0; y < h; y++){
            for(int x = 0; x < w; x++){
                if(random){
                    int v = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
                    array[y][x] = v == 0 ? 1 : v;
                }else{
                    array[y][x] = ct++;
                }
            }
        }
        return array;
    }

    public static void print(int[][] array){
        String out = "{";
        for(int y = 0; y < array.length; y++){
            out += "{";
            for(int x = 0; x < array[y].length; x++){
                out += array[y][x];
                if(x != array[y].length -1)
                    out += ", ";
            }
            out += "}";
            if( y != array.length -1)
                out+=",\n";
        }
        out+= "}\n";
        System.out.println(out);
    }
}