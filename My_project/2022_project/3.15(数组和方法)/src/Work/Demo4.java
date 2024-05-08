package Work;

import java.util.Arrays;

//4.定义一个方法，方法有一个int类型的参数，根据参数创建指定长度的一维数组，
public class Demo4 {
    public static void main(String[] args) {
        show(5);
    }

    public static void show(int n){
        int[] a = new int[n*n];
        a[a.length-1] = 0;
        for (int i = 0; i < a.length-1; i++) {
            a[i] = i+1;
        }
        System.out.println("数组的长度为：" + a.length + "\n" + Arrays.toString(a));
    }
}
