package Work;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//5.定义数组{1,2,3}要求输入一个整数n后，数组扩容变成{1,2,3,n}
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] a = {1,2,3};
        System.out.println("请输入扩容后的数组长度");
        int n = sc.nextInt();
        int[] b = new int[n];
        int num = a.length>=b.length?b.length:a.length;
        for (int i = 0; i < num; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
