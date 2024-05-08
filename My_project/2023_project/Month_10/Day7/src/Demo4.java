import java.util.Arrays;
import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        /**
         * 9换1~8,8换1~7....打乱数组
         */
        Random r = new Random();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = nums.length - 1; i > 0; i--) {
            int num1 = r.nextInt(i + 1);
            int num2 = nums[i];
            nums[i] = nums[num1];
            nums[num1] = num2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
