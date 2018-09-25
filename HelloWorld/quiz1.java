 
public static void printArray(int[]arr, boolean skip){
int x = 0;
int y = 0;
if (skip == true){
while (x < arr.length){
System.out.print(arr[x]);
x += 2;
}
}

if (skip == false){
while (y < arr.length){
System.out.print(arr[y]);
x += 1;
}
}
}