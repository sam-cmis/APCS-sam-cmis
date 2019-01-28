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
        int a = 0;
        int b = 0;
        while (b < array.length){
            if (one[a] < second[b]){
                for (int x = 0; x < array[second].length; x++){
                    one[x] = second[x];
                    for (int y = 0; y< array[0].length; y++){
                        second[x] = one[a];
                        a++;
                        if(array[y] < array[z])
                        {
                            z = y;
                        }
                        int a = array[x];
                        array[x] = array[z];
                        array[z] = a;
                    }
                }
            }
            else if (one ){
                for (int x = 0; x < array[one].length; x++){
                    second[x] = one[x];
                    for (int y = 1; y< array[0].length; y++){
                        one[a] = second[x];
                        x++;
                        if(array[z] < array[y])
                        {
                            y = z;
                        }
                        int b = array[y];
                        array[y] = array[z];
                        array[z] = b;
                    }
                }
            }

            else if (array.length == 0){
                return 0;
            }
            else if(array.length == 1){
                return array;
            }
            }
        return array;
        }
    //increment sides using the index that is being tracked.
    }