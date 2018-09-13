import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("BinaryConverter");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
    }

    static void convertToBinary(int no){
        int container[] = new int[100];
        int i = 0;
        while (no > 0){
            container[i] = no%2;
            i++;
            no = no/2;
        }
        for (int j = i -1 ; j >= 0 ; j--){
            System.out.print(container[j]);
        }
    }

    public static int convertToBinaryUsingString(String binary){
        char[] numbers = binary.toCharArray();
        Integer result = 0;
        int count = 0;
        for(int i=numbers.length-1;i>=0;i--){
            if(numbers[i]=='1')result+=(int)Math.pow(2, count);
            count++;
        }
        return result;
    }
}