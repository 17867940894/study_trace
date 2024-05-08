import java.util.Arrays;

public class Demo2 {
    /**
     * 将两个int类型的数组拼接成一个新数组
     */
    public static void main(String[] args) {
        int[] m = {1,2,3,4};
        int[] n = {6,7,8,9};
        int[] mn = new int[m.length + n.length];
        for (int i = 0; i < mn.length; i++) {
            if (i < m.length){
                mn[i] = m[i];
            }else {
                mn[i] = n[i - m.length];
            }
        }
        System.out.println(Arrays.toString(mn));
    }
}
