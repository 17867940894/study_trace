import java.util.Arrays;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * 打乱数组
         */
        Random r = new Random();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1)
                break;
            num1 = r.nextInt(nums.length - i - 1);
            num2 =  nums[nums.length - i - 1];
            nums[nums.length - i - 1] = nums[num1];
            nums[num1] = num2;
        }

        /*for (int i = 0; i < nums.length; i++) {
            num1 = r.nextInt(nums.length);
            num2 = nums[i];
            nums[i] = nums[num1];
            nums[num1] = num2;
        }*/
        System.out.println(Arrays.toString(nums));
    }
}
