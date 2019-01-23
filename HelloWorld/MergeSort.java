public class MergeSort
{
    public static void main(String[] args){
        int[] numbers = new int[6];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static int sort(int[] array){
        int[] one = new int[array.length/2];
        int[] second = new int[array.length - array.length/2];
        int frontarray = 0;
        int backarray = 0;
        int a = 0;
        int b = 0;
        for (int x = 0; x < array.length; x++){
            one[x] = second[x];
        }
        for (int y = 1; y< array[0].length; y++){
            second[x] = one[a];
            a++;
        }
        if (array[one] < array[second]){

            for(int x = 0; x <array.length; x++)
            {
                int z = x;
                for(int y =x; y < array.length; y++)
                {
                    if(array[y] < array[z])
                    {
                        z = y;
                    }
                }
                int a = array[x];
                array[x] = array[z];
                array[z] = a;
            }
        }

        else if(array.length == 0 || 1){
            return array;
        }
        else {
            return sort(

        }
    }
}