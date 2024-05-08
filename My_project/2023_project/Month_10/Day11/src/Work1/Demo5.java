package Work1;

import java.util.Scanner;

public class Demo5 {
    /**
     * 定义两个登录方法，1号方法的参数是密码，2号方法的参数是密码和验证码
     * 要求：密码错误次数没到3次使用1号方法进行登录，错误次数到达3次使用2号方法进行登录
     */
    static int index = 0;
    static String pas = "3167918581";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        login1();
    }

    private static void login1() {
        System.out.println("请输入密码");
        String password = sc.next();
        if (password.equals(pas))
            System.out.println("登陆成功");
        else {
            System.out.println("输入错误");
            ++index;
            if (index == 3)
                login2();
            login1();
        }
    }

    private static void login2() {
        System.out.println("请输入密码和验证码");
        String password = sc.next();
        System.out.println("请输入验证码:12345");
        String cod = sc.next();
        if (password.equals(pas) && cod.equals("12345")) {
            System.out.println("登陆成功");
            return;
        } else {
            System.out.println("密码或验证码有误，请重新输入");
            login2();
        }
    }
}
