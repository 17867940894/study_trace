import java.util.Arrays;

public class Demo10 {
    /*
给你一个由 n 个整数组成的数组nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组[nums[a], nums[b], nums[c], nums[d]]（若两个四元组元素一一对应，则认为两个四元组重复）：

0 <= a, b, c, d< n
a、b、c 和 d 互不相同
nums[a] + nums[b] + nums[c] + nums[d] == target
你可以按 任意顺序 返回答案 。

输入：nums = [1,0,-1,0,-2,2], target = 0
输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

输入：nums = [2,2,2,2,2], target = 8
输出：[[2,2,2,2]]
     */
    public static void main(String[] args) {
        int[] arr = {-5, -3, -1, 0, 2, 4, 6};
        show1(arr, 0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        show_2(arr, 0);
    }

    /**
     * 不允许重复值
     *
     * @param arr
     * @param sum
     */
    private static void show1(int[] arr, int sum) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (i > arr.length - 4 || arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] > sum)
                break;
            int[] test = new int[4];
            test[0] = arr[i];
            for (int j = i + 1; j < len; j++) {
                test[1] = arr[j];
                for (int k = j + 1; k < len; k++) {
                    test[2] = arr[k];
                    for (int l = k + 1; l < len; l++) {
                        test[3] = arr[l];
                        if (show2(test) == sum)
                            System.out.println(Arrays.toString(test));
                    }
                }
            }
        }
    }

    private static int show2(int[] test) {
        int sum = 0;
        for (int i : test) {
            sum += i;
        }
        return sum;
    }

    /**
     * 允许重复的数据
     *
     * @param arr 传入数组
     * @param sum target值
     */
    private static void show_2(int[] arr, int sum) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (i > arr.length - 4 || arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] > sum)
                break;
            int[] test = new int[4];
            test[0] = arr[i];
            for (int j = 0; j < len; j++) {
                test[1] = arr[j];
                for (int k = 0; k < len; k++) {
                    test[2] = arr[k];
                    for (int l = 0; l < len; l++) {
                        test[3] = arr[l];
                        if (show2(test) == sum)
                            System.out.println(Arrays.toString(test));
                    }
                }
            }
        }
    }
}
