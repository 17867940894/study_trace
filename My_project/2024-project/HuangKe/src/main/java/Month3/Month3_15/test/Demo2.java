package Month3.Month3_15.test;

public class Demo2 {
    public static void main(String[] args) {
        int num = 20;
//        demo1();
        demo2(num,  "* ");
    }

    //金字塔
    private static void demo2(int num, String s) {
        for (int i = 0; i < num; i++) {
            for (int j = num - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    //九九乘法表
    private static void demo1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
