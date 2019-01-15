public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
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

    public static void sort(int[] array){
        boolean swap = true;
        int temp = 0;
        for (int ex  = 0; ex < array.length-1; ex ++){
            if (array[ex] > array[ex+1]){
                temp = array[ex];
                array[ex+1] = temp;
            }  
            }
        for (int no = 0; no < array.length-1; no ++){
            temp = no;
            no = temp;
            
        }
        }
    //move along the array and compare index with the number to the right
    //switch the first unsorted number with the smallest number
}
