package Demo1;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        if (input.hasNextInt()) {
            int a = input.nextInt();
            System.out.println(a);
        } else {
            System.out.println("小东西，我就知道你不老实，麻溜输入数字");
        }
    }
}
