package Work;

import java.util.Arrays;
import java.util.Random;
//将1~9中的每个数字放到长度为9的int数组中，保证每个元素唯一
public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            boolean b = true;
            int n = r.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] == n){
                    b = false;
                    i--;
                }
            }
            if (b)
                arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
