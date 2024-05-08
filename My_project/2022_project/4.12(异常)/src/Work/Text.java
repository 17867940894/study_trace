package Work;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] b = {0,0,0,0,0,0,0};
        System.arraycopy(a,9,b,6,1);
        System.out.println(Arrays.toString(b));
    }
}
