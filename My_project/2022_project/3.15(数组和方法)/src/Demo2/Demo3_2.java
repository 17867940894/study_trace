package Demo2;

import java.util.Arrays;

public class Demo3_2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[][] b = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            b[i/3][i%3] = a[i];
        }
        for(int[] i : b){
            System.out.println(Arrays.toString(i));
        }
    }
}
