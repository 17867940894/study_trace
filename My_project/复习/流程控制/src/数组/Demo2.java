package 数组;

import java.util.Random;

/*
一维数组打乱
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] s = {1, 2, 5, 7, 9, 35, 8262, 454, 2, 48946, 4};
        Random r = new Random();
        int num = 0;
        for (int i = 0; i < s.length; i++) {
            int n = r.nextInt(s.length);
            num = s[n];
            s[n] = s[i];
            s[i] = num;
        }
        for (int j : s) {
            System.out.print(j + " ");
        }
    }
}
