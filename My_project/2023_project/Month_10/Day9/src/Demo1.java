import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        /**
         *   //TODO 动态扩容
         * 定义一个长度为0的String类型的空数组，
         * 要求每次键盘输入内容按下回车后就将输入的内容依次存放到数组中，
         * 例如：{}
         * 输入"abc"，数组变成{"abc"}
         * 再输入"6"，数组变成{"abc","6"}
         * 依次类推
         */
        String[] text1 = {};
        Scanner sc = new Scanner(System.in);
        for (;;) {
            text1 = Arrays.copyOf(text1, text1.length + 1);
            String text = sc.next();
            text1[text1.length-1] = text;
            System.out.println(Arrays.toString(text1));
        }
    }
}
