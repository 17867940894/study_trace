package WORK;

import java.util.Arrays;

/*
2.定义方法，参数是int数组，返回这个int数组中0元素所在下标的数组
例如：参数是{1，3，4，0，7，0，8，3}，返回{3，5}
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 0, 7, 0, 8, 3};
        System.out.println(Arrays.toString(show(a)));
    }

    private static int[] show(int[] a) {
        int num = 0;
        for (int i : a) {
            if (i == 0)
                ++num;
        }
        int[] index = new int[num];
        num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                index[num++] = i;
        }
        return index;
    }
}
