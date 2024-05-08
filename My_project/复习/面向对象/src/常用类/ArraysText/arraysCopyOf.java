package 常用类.ArraysText;

import java.util.Arrays;

public class arraysCopyOf {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,30,54};
        int[] b = {1,2,3,30,54};
        System.arraycopy(a,5,b,1,4);//TODO 把a数组的2下标开始的四个值，填充给b数组的1下标开始长度为4的数值
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
