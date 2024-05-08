package Work;

import java.util.Arrays;

public class Demo3 {
    /**
     * 将上一题中返回的数组倒置并返回
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 9, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(inversion(Demo2.findZero(nums))));
    }

    private static int[] inversion(int[] zero) {
        int inversion[] = new int[zero.length];
        for (int i = zero.length - 1; i >= 0; i--) {
            inversion[zero.length - i - 1] = zero[i];
        }
        return inversion;
    }
}
