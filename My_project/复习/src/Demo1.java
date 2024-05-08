import static java.lang.Integer.parseInt;

public class Demo1 {
    //寻找最近的回文数
    public static void main(String[] args) {
        System.out.println(nearestPalindromic("99"));
    }

    public static String nearestPalindromic(String n) {
        int m = 0;
        int m2 = 0;
        int m3 = parseInt(n);
        for (int i = m3; i < 1000; i++) {
            if ((i + "").charAt(0) == (i + "").charAt((i + "").length() - 1) && i != m3) {
                m = i;
                break;
            }
        }
        for (int i = m3; i > 0; i--) {
            if ((i + "").charAt(0) == (i + "").charAt((i + "").length() - 1) && i != m3) {
                m2 = i;
                break;
            }
            m2 = i;
        }
        return (Math.abs(m - m3) >= Math.abs(m3 - m2) ? m2 : m) + "";
    }
}
