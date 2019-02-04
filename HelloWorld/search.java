public class search{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4};
    }

    public static int search(int[] array, int threshold){
        for (int x = 0; x < array.length; x++){
            if (array[x] == threshold){
                return x;
            }
            else {
                return -1;
            }
            }
        }
    }

