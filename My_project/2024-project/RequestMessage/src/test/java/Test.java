import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = "1234";
        System.out.println("验证码:" + code);
        System.out.println("请输入验证码:");
        String inputCode = sc.next();
        System.out.println("用户的输入值为：" + inputCode);
    }

}
