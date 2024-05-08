package matches;

public class Demo1 {
    public static void main(String[] args) {
        String number = "17867940894";
        PhoneNumberFunction(number);
        String qq = "3167918581@qq.com";
        QQEmilFunction(qq);
    }

    private static void QQEmilFunction(String qq) {
        String regQQ = "[1-9][0-9]{9}@qq\\.com";
        if (qq.matches(regQQ))
            System.out.println("qq邮箱格式正确");
    }

    private static void PhoneNumberFunction(String number) {
        String regNumber = "1[0-9]{10}";
        if (number.matches(regNumber))
            System.out.println("手机号码格式正确");
    }
}
