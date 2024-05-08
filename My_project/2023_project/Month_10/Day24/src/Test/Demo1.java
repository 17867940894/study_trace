package Test;

import java.util.Arrays;

public class Demo1 {
    /**
     * 测试形参实参引用数据类型的传递
     * @param args
     */
    public static void main(String[] args) {
        int[] num = new int[1];
        num[0] = 20;
        System.out.println(Arrays.toString(num));
        show(num);
        System.out.println(Arrays.toString(num));
    }

    private static void show(int[] num) {
        num[0] = 10;
        System.out.println("show方法" + Arrays.toString(num));
    }
}
