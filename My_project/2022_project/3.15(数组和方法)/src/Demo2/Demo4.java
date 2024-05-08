package Demo2;

import java.util.Arrays;
import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = r.nextInt(1000);
            }
        }
        double sum = 0;
        int n = 0;
        for(int[] i : a) {
            for (int j : i){
            sum += j;
            ++n;
            }
            System.out.println(Arrays.toString(i) + "\tsum的值：" + sum);
        }
        System.out.println(sum);
        System.out.println(sum / n);
    }
}
