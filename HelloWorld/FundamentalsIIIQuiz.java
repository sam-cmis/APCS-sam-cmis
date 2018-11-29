public class FundamentalsIIIQuiz{
    public static void main(String[] args){
        int[][] array1 = {{606, -11778, 14724, 19623},
                {-9474, 12334, 2791, -13518},
                {-13681, -8397, -6940, -726},
                {-2978, 7212, 2201, 6735}};

        int[][] array2 = {{-11882, -4377, 5226, -664, -1108, 7142, 2017},
                {7071, -8942, -13904, -17035, -2606, -11831, -13766},
                {-12234, -9534, -15779, 13615, 10270, -6859, 6361},
                {-6033, -549, -15958, 17019, -9666, -4876, -6368}};

        int[][] array3 = {{-5487, -18628, 3365, -14728, 10979},
                {-11403, 13387, -10335, -10113, -12000},
                {-10585, -18889, 15515, -16093, -6097},
                {-17722, 9392, -13208, -17901, -6223},
                {-14081, -10776, -6435, -13976, 2823},
                {-13029, -8753, -5213, -3666, 13910},
                {16639, -11206, -14375, 8119, -9044},
                {7253, -11243, -9436, -14244, -15883}};

    }

    public static boolean allGreater(int[][] array, int threshold){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] > threshold){
                    System.out.print("true");
                }
                else
                {
                    System.out.print("false");
                }
            }
        }
        return array;
    }

    public static int[][] invertSign(int[][] array, boolean positive){
        int w =0; 
        for (int x = 0; x < array.length; x++){
            for (int y = 0; y < array[0].length; y++){
                if (positive = false){
                    if (w > 0){
                        w = w * -1;
                    }
                }
                if (positive = true){
                    if (w < 0){
                        Math.abs(-w);
                    }
                }
            }
        }    
        return array;
    }

    public static int[][] swapColumns(int[][] array, int c1,int c2){
        int [][] output = new int [array.length][array[0].length]; 
        for (int b = 0; b < array.length; b++){
            if (b < c1){
                output[b] = array[b]; 
            }else if(b >= c1 && b != array.length -1){
                output[b+1] = array[b]; 
            }
        }
        return output; 
        }
    }
