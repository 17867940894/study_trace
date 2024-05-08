package Demo1;

public class Demo3 {
    public static void main(String[] args) {
        String s = "123456789987654321";
        boolean b = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
