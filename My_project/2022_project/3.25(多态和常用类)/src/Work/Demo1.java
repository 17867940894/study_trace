package Work;

import java.util.Arrays;

//TODO 1.自定义方法实现Arrays.copyOf()
public class Demo1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(show(a,5)));
    }

    private static int[] show(int[] a, int i) {
        int[] index = new int[i];
        int min = Math.min(a.length,i);
        for (int j = 0; j < min; j++) {
            index[j] = a[j];
        }
        a = index;
        return a;
    }
}
