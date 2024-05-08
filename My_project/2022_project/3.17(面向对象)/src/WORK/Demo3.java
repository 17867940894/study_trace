package WORK;

import java.util.Arrays;

//3.将上一题中返回的数组倒置并返回
public class Demo3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 0, 7, 0, 8, 3};
        System.out.println(Arrays.toString(show(a)));
    }

    private static int[] show(int[] a) {
        int[] index = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            index[i] = a[a.length - i - 1];
        }
        return index;
    }
}
