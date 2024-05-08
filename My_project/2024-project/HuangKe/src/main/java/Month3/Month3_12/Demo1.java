package Month3.Month3_12;

import java.util.Scanner;

public class Demo1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        function_1();
        function_2();
    }

    private static void function_2() {
        System.out.println("请输入a-g");
        int week = showWeek(sc.nextLine());
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("今天星期" + week);
                break;
            case 7:
                System.out.println("今天星期天");
                break;
            default:
                System.out.println("输入有误");
        }
    }

    private static int showWeek(String s) {
        for (int i = 'a'; i <= 'g'; i++) {
            if (s.charAt(0) == i)
                return i - 'a' + 1;
        }
        return 0;
    }

    private static void function_1() {
        System.out.println("欢迎使用售票系统");
        int ticket;//票价
        System.out.println("请输入当前月份:");
        int month = sc.nextInt();
        System.out.println("请输入游客的年龄:");
        int age = sc.nextInt();
        if (month >= 4 && month <= 10){
            ticket = ageMoney(age);
        }else {
            if (age >= 18)
                ticket = 40;
            else
                ticket = 20;
        }
        System.out.println("票价为:" + ticket);
    }

    //根据游客年龄返回旺季价格
    private static int ageMoney(int age) {
        if (age >= 60)
            return 60 / 3;
        if (age >= 18)
            return 60;
        return 60 / 2;
    }
}
