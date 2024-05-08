package Demo2;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        int n = 0;
        String pow = "316791";
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (n == 3) {
                System.out.println("账号已冻结");
                break;
            }
            if (n != 0) {
                System.out.println("你还有" + (3 - n) + "次机会，请输入");
            } else {
                System.out.println("请输入密码:");
            }
            String s = sc.nextLine();
            if (s.equals(pow)) {
                System.out.println("登陆成功");
                break;
            }
            ++n;
        }
    }
}
