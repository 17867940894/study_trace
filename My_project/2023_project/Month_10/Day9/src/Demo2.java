public class Demo2 {
    public static void main(String[] args) {
        /*
        1.定义方法，参数是可变参数，计算参数的平均值、最大最小值、总和
        2.定义方法返回a的b次方
        3.定义方法判断两个二维数组中的元素是否完全相同
         */
        int[] nums = {5, -3, 7, 9, 2, 5, 6, 65, 110};
        int[] a = {5, -3, 7, 9, 2, 5, 6, 65, 110};
        int[] b = {5, -3, 2, 9, 2, 5, 6, 65, 110};
        int m = 0;
        int n = 0;
        System.out.println("最大值是" + Max(nums));
        System.out.println("最小值是" + Min(nums));
        System.out.println("平均值是" + Mean(nums));
        System.out.println("a的b次方是" + TO_the_power(m, n));
        if (Same(a, b))
            System.out.println("相等");
        else
            System.out.println("不相等");
    }

    //判断数组内容是否相等
    public static boolean Same(int[] a, int[] b) {
        boolean boo = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    //返回int a 的 b次方
    public static double TO_the_power(int a, int b) {
        return Math.pow(a, b);
    }

    //最大值
    public static int Max(int[] nums) {
        int num = 0;
        for (int m : nums) {
            num = num >= m ? num : m;
        }
        return num;
    }

    //最小值
    public static int Min(int[] nums) {
        int num = 0;
        for (int m : nums) {
            num = num <= m ? num : m;
        }
        return num;
    }

    //平均值
    public static double Mean(int[] nums) {
        double num = 0;
        for (int m : nums) {
            num += m;
        }
        return num / nums.length;
    }
}
