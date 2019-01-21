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
        int[] second = new int[array.length/2];
        for (int x = 0; x < array.length; x++){
            
        }
        if (array.length == 1){
            sort it;
        }
        else {
            return sort(one);
        }
      
        }
    }