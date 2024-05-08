package Demo2;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[][][] b = new int[1][3][3];
        for (int i = 0; i < a.length; i++) {
            b[0][i/3][i%3] = a[i];
        }
        for(int[][]i : b){
            for(int[] j : i){
                System.out.println(Arrays.toString(j));
            }
        }
    }
}
