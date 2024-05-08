package Work;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {0, 0, 0, 0, 0, 0, 0};
        SystemArrayCopy(a, 9, b, 6, 1);
        System.out.println(Arrays.toString(b));
    }

    private static void SystemArrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        if (src == null || dest == null)
            throw new NullPointerException("数组不能为空");
        if (srcPos >= src.length || destPos >= dest.length)
            throw new ArrayIndexOutOfBoundsException("数组不存在该下标");
        if (srcPos + length > src.length || destPos + length > dest.length)
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        for (int i = srcPos; i < src.length; i++) {
            dest[destPos++] = src[i];
        }
    }
}