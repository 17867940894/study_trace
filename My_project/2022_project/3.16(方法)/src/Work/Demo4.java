package Work;

import java.util.Scanner;

//4.定义两个登录方法，1号方法的参数是密码，2号方法的参数是密码和验证码要求：密码错误次数没到3次使用1号方法进行登录，错误次数到达3次使用2号方法进行登录
public class Demo4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; ; ++i) {
            if (Start("aa", "bb", i)) {
                System.out.println("登陆成功");
                break;
            } else if (i > 2) {
                System.out.println("输入有误，请重新输入");
            } else {
                System.out.println("用户名或密码有误!");
            }
        }
    }

    private static boolean Start(String s, String ss, int i) {
        if (i <= 3) {
            return user(s) && pow(ss);
        } else {
            String code = "6666";
            return user(s) && pow(ss) && code(code);
        }
    }

    private static boolean code(String code) {
        System.out.println("请输入验证码:");
        String s = sc.nextLine();
        if (s.equals(code))
            return true;
        else
            return false;
    }

    private static boolean pow(String ss) {
        System.out.println("请输入密码:");
        String pow = sc.nextLine();
        if (ss.equals(pow))
            return true;
        else
            return false;
    }

    private static boolean user(String s) {
        System.out.println("请输入用户名:");
        String user = sc.nextLine();
        if (s.equals(user))
            return true;
        else
            return false;
    }
}
