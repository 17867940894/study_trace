import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    /**
     * 定义数组{1,2,3}要求输入一个整数n后，数组扩容变成{1,2,3,n}
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整形数据");
        int num = sc.nextInt();
        int[] num1 = {1,2,3};
        int[] num2 = new int[num1.length+1];
        for (int i = 0; i < num2.length; i++) {
            if (i == num2.length-1) {
                num2[i] = num;
                break;
            }
            num2[i] = num1[i];
        }
        System.out.println(Arrays.toString(num2));
    }
}
