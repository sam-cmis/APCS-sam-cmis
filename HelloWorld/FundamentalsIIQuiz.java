public class FundamentalsIIQuiz {
  public static void main (String args[]){

  }
    
    public static int[] minmax(int[] array){
    int[] arr = new int[0];
    int minMax = 0;
    for(int i = 1; i <= arr.length; i++){
        System.out.print("Number " + i + ": ");
    }
    System.out.println();
    int smallest = Math.min(minMax);
    System.out.println("Smallest = " + smallest);
    int largest = Math.max(minMax); 
    System.out.println("Largest = " + largest);
  }

  public static int[] filter(int[] array, int min, int max, boolean positive)
    {
   int[] arr = new int[0];
   int x = 0;
   int y = 0;
    int minMax = 0;
   for(int i = 1; i <= array.length; i++){
        System.out.print("Number " + i + ": ");
    }
    System.out.println();
    int smallest = Math.min(minMax);
    System.out.println("Smallest = " + smallest);
    int largest = Math.max(minMax); 
    System.out.println("Largest = " + largest);
   for (y=0; y < array.length; y++){
    if (positive == true){
       
       System.out.print(k);
    }
   }
   return array;
   }  
  }