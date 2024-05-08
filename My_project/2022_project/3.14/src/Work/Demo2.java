package Work;
//打乱数组（两种方法）
import java.util.Arrays;
import java.util.Random;
//洗牌算法
public class Demo2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = a.length;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(n);
            int m = a[i];
            a[i] = a[num];
            a[num] = m;
        }
        System.out.println(Arrays.toString(a));
    }
}
