public static String[][] locate(String[][] arr){
int y = (int) (Math.random() * (arr.length / arr[0].length)); 
int x = (int) (Math.random() * (arr[0].length));
int num = (int) (Math.random() * (10));   
String s_num = "" + num;
for (int i = 0; i < arr.length; i++){
for (int j = 0; j < arr[0].length; j++){
if (i==y && j ==x){
arr[i][j] = s_num; 
}
}
}
return arr; 
}