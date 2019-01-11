public class BubbleSort
{
    public static void main(String[] args){
        int[] array = getArray(20, true);
        print(array);
        sort(array);
        print(array);
    }

    public static int[] sort(int[] array){
        boolean swap = true;
        int temp = 0;
        while (swap != false){
            swap = false;
            for (int ex  = 0; ex < array.length-1; ex ++){
                if (array[ex] > array[ex+1]){
                    temp = array[ex];
                    array[ex] = array[ex+1];
                    array[ex+1] = temp;
                    swap = true;
                }
            }
        }
        return array;
    }

    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++){
            if(random){
                array[i] = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
            }
            else {
                array[i] = ct++;
            }
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++){
            out += array[i];
            if(i != array.length -1){
                out +=", ";
            }
        }
        out+= "}\n";
        System.out.println(out);
    }
}