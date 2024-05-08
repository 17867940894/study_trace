package For循环;

import java.util.Scanner;

/*
.使用for循环完成所有课堂练习，包含while的案例
*2.尝试完成
   1
  121
 12321
1234321
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("您需要打印几行");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }

            for (int j = 1; j < i; j++) {
                System.out.print(n - j);
            }
            System.out.println();
        }
    }
}
