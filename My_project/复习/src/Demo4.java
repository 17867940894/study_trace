import java.util.Arrays;

public class Demo4 {
    /*
    4. 寻找两个正序数组的中位数
     */
    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 6};
        int[] num2 = {77, 8, 6, 3, 0};
        int[] num3 = Arrays.copyOf(num1, num1.length + num2.length);
        int n = num3.length;
        for (int i = 0; i < num2.length; i++) {
            num3[num1.length + i] = num2[i];
        }
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));
        if (n % 2 == 0) {
            System.out.println((num3[n / 2] + num3[n / 2 + 1]) / 2);
        } else {
            System.out.println(num3[n / 2]);
        }
    }
}
