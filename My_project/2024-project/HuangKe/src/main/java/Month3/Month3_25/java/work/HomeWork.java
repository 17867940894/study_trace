package Month3.Month3_25.java.work;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
//        demo1(100000.0, 0);
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
//        demo7();
//        demo8();
//        demo9();
//        demo10();
    }

    private static void demo10() {
        /*
        求3~100中的所有的素数
         */
        for (int i = 3; i <= 100; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(i);
        }


    }

    private static void demo9() {
        /*
        《孙子算经》中记载了这样一道题目，今有鸡、兔同笼，上有三十五个头，下有九十足，问鸡、免各几只?试编写程序解决这个问题。
         */
        for (int i = 0; i <= 35; i++) {
            for (int j = 0; j <= 35 - i; j++) {
                if (i*2 + j*4 == 90)
                    System.out.println("鸡：" + i + "只" + "\t兔：" + j + "只");
            }
        }
    }

    private static void demo8() {
        /*
        编程实现加、减、乘、除简单计算器。
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 = scanner.nextDouble();
        System.out.println("请输入运算符(+, -, *, /)：");
        char operator = scanner.next().charAt(0);
        System.out.println("请输入第二个数字：");
        double num2 = scanner.nextDouble();
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("错误：除数不能为0");
                    return;
                }
                break;
            default:
                System.out.println("错误：无效的运算符");
                return;
        }
        System.out.println("结果：" + result);
    }

    private static void demo7() {
        /*
        任意输入三个整数，请按大小顺序输出它们。
         */
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[3];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入数字");
            nums[i] = sc.nextDouble();
        }
        Arrays.sort(nums);
        for (double num : nums) {
            System.out.println(num);
        }
    }

    private static void demo6() {
        /*
           6.从键盘输入一个整数，控制台输出整数对应层数的金字塔
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入层数：");
        int num = sc.nextInt();
        String s = "* ";
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

    private static void demo5() {
        /*
        5.求1+（1+2）+（1+2+3）+（1+2+3+4）+ .... +(1+2+3+...+100)
         */
        int sum = 0;
        int sums = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            sums += sum;
        }
        System.out.println(sums);
    }

    private static void demo4() {
        /*
            4.输出1--100之间的不能被5整除的数，每5个一行
         */
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println(); // 输出换行
                }
            }
        }
    }

    private static void demo3() {
        /*
          3.键盘输入一个年份，判断这个年份是否为闰年
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }

    private static void demo2() {
        /*
        2.键盘输入一个整数，属于哪个范围：大于0；小于0；等于0
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = scanner.nextInt();
        if (number > 0)
            System.out.println("输入的整数大于0");
        else if (number < 0)
            System.out.println("输入的整数小于0");
        else
            System.out.println("输入的整数等于0");
    }


    private static void demo1(double money, int count) {
        /*
            1.某人有 100,000元，每经过一次路口就需要交费，规则如下：
                当现金 > 50000时，每次交5%
                当现金 <= 50000，每次交1000
            编程计算该人可以经过多少次路口，要求：使用 while break 方式完成
        */
        while (money >= 1000) {
            money = money > 50000 ? money * 0.95 : money - 1000;
            count++;
        }
        System.out.println("该人可以经过路口的次数为: " + count);
    }
}
