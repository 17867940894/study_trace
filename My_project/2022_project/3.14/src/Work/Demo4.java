package Work;

import java.util.Arrays;

//将两个int类型的数组拼接成一个新数组
public class Demo4 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,4,1,5};
        int[] c = new int[a.length + b.length];
        for (int i = 0,j = 0; i < c.length; i++) {
            if (i < a.length){
                c[i] = a[i];
            }else{
                c[i] = b[i-a.length];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
