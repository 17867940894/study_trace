package Demo1;

import java.util.Arrays;
import java.util.Random;

//传入数组，并打乱
public class Demo1 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12}
        };
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        show(b);
        System.out.println("一维数组打乱：\n" + Arrays.toString(b));
        System.out.println("二维数组打乱");
        show(a);
    }

    private static void show(int[] a) {
        int n = a.length;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(n);
            int m = a[i];
            a[i] = a[num];
            a[num] = m;
        }
    }

    private static void show(int[][] a) {
        int n = 0;
        for (int[] i : a) {
            n += i.length;
        }
        int[] arr = new int[n];
        n = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arr[n++] = a[i][j];
            }
        }
        n = 0;
        show(arr);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = arr[n++];
            }
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
