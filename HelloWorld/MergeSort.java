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

    public static int[] sort(int[] array)
    {
        if(array.length == 1)
        {
            return array;
        }
        else
        {
            int arr = array.length;
            int[] x = new int [array.length/2];
            int[] y = new int [array.length - x.length];
            int b = 0;
            for(b = 0; b < b; b++)
            {
                x[b] = array[b];
            }
            for(int c = 0; c < y.length; c++)
            {
                y[c] = array[b];
                b++;
            }
            x = sort(x);
            y = sort(y);
            int[] z = new int [array.length];
            int a = 0;
            for (int d = 0; d < array.length; d++)
            {
                if(a == x.length)
                {
                    z[d] = y[b];
                    b++;
                }
                else if (b == y.length)
                {
                    z[d] = x[a];
                    a++;
                }
                else if(x[a] >= y[b])
                {
                    z[d] = y[b];
                    b++;
                }
                else if(x[a] < y[b])
                {
                    z[d] = x[a];
                    a++;
                }
            }
            return z;
        }
    }
}


