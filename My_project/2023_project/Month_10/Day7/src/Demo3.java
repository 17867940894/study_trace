import java.util.Arrays;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        /**
         * 有序数组无序赋值给另一长度相同的数组
         */
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = new int[nums1.length];
        String s = "";
        Random r = new Random();
        boolean b;
        for (int i = 0; i < nums1.length; i++) {
            int m = r.nextInt(nums1.length);
            if (s.length() == nums1.length) {
                break;
            }
            b = true;
            for (int j = 0; j < s.length(); j++) {
                if (nums2[j] == nums1[m]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                nums2[i] = nums1[m];
                s += nums2[i];
            } else {
                i--;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}
