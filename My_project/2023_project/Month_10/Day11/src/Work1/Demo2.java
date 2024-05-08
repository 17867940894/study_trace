package Work1;

public class Demo2 {
    /**
     * 返回一个数组中的最大值
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,20, 6, 7, 8, 9};
        System.out.println(Max(nums));
    }

    private static int Max(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = max>=num?max:num;
        }
        return max;
    }
}
