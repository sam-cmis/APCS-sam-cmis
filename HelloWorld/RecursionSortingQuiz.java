public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println("I'm ready to serve you!");
    }

    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 3! => 3 * 2 * 1 => 6
     * 0! => 1
     */
    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    public static int[] kiefferSort(int[] array){
        if (array.length <= 1){
            return array;
        }
        for(int i = 0;i < array.length-1; i++){
            if(array[i] > array[i + 1]){
                int tmp = (int)(Math.random() * (array.length));
                int x = array[0];
                array[0] = array[tmp];
                array[tmp] = x;
                array = kiefferSort(array);
            }
        }
        return array;
    }
}