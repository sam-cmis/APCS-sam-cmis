public class tester2
{
    public static void main(String[] args){
        ArrayType at = ArrayType.SORTED; //SORTED, RANDOM, or REVERSED
        int n = 50;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        System.out.println("UNSORTED");
        long totalTime = 0;
        int runs;
        for(runs = 0; runs < 100; runs++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            totalTime+=btime;
            array = tmp;
        }
        
        long avgTime = (long)(totalTime/(double)runs);
        System.out.println(avgTime);
        
        
    }
}
