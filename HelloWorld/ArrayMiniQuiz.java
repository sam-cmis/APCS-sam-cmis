public class ArrayMiniQuiz
{
    public static int[] main(int a){
        int[] a1 = {2, 4, 6, 8, 10, 12};
        int[] a2 = new int[5];
        
        a2[0] = a1[a1.length - 1];
        a2[1] = a1[a1.length - a1[0]];
        a2[a1[1]] = a1[a2[a1[1]]];
        a1[a1[1]] = a1[a2[2]] - a1[a1[0]];
        a2[a2[a2.length - 2]] = a1[a1[1]];
        a2[a1[1] - 1] = a1[1] - a2[a2.length - 1];
        //What is the value of a2 as of line 13?
        System.out.print(a2);
        return a2;
    }
    
}