package Demo1;

public class Demo3_2 {
    public static void main(String[] args) {
        String s = "zxcvbn m nbvcxz";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println("不是回文数");
                break;
            }
            if (i == s.length() / 2 - 1) {
                System.out.println("是回文数");
            }
        }
    }
}
