package Work;

import java.util.Arrays;

public class Demo2 {
    /**
     * 定义方法，参数是int数组，返回这个int数组中0元素所在下标的数组
     * 例如：参数是{1，3，4，0，7，0，8，3}，返回{3，5}.
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 9, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(findZero(nums)));
    }

    public static int[] findZero(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                index++;
        }
        int[] indexs = new int[index];
        index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                indexs[index] = i;
                index++;
            }
        }
        return indexs;
    }
}
