package Work;

import java.util.Arrays;
import java.util.Random;

////打乱数组（两种方法）
public class Demo2_2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int num = a.length;
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            int m = r.nextInt(a.length);
            int n = r.nextInt(a.length);
            int s = a[m];
            a[m] = a[n];
            a[n] = s;
        }
        System.out.println(Arrays.toString(a));
    }
}
