public class tester2
{
    public static void main(String[] args){
        ArrayType at = ArrayType.SORTED; //SORTED, RANDOM, or REVERSED
        int n = 5;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        System.out.println("UNSORTED");
        long totalTime = 0;
        long btotalTime = 0;
        long btotalSteps = 0;
        long mtotalTime = 0;
        long mtotalSteps = 0;
        int runs;
        
        for(runs =0; runs < 10; runs++){
            tmp = array;
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            btotalTime += btime;
            btotalSteps += BubbleSort.steps;
            
            array = tmp;
            start = System.nanoTime();
            MergeSort.sort(array);
            mtime = System.nanoTime() - start;
            mtotalTime += mtime;
            mtotalSteps += MergeSort.steps;
            MergeSort.steps = 0;
            
            array = Util.getArray(n, at);
            
        }
        long bavgTime = (long)(totalTime/(double)runs);
        long bavgSteps = (long)(btotalSteps/(double)runs);
        System.out.println("BubbleSort Avg Runtime" + bavgTime);
        
        System.out.println(avgTime);
        
        start = System.nanoTime();
        BubbleSort.sort(array);
        btime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        SelectionSort.sort(array);
        stime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        InsertionSort.sort(array);
        itime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        MergeSort.sort(array);
        mtime = System.nanoTime() - start;

        System.out.println("SORTED");
        Util.print(array);

        System.out.format(
            "BubbleSort: %d %d\n"+
            "SelectionSort: %d %d\n"+
            "InsertionSort: %d %d\n"+
            "MergeSort: %d %d\n", 
            btime, BubbleSort.steps, stime, SelectionSort.steps,  itime, InsertionSort.steps, mtime, MergeSort.steps);
    }
    }

