public class Demo7 {
    /*
    7. 整数反转给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     */
    public static void main(String[] args) {
        System.out.println(show(12560));
    }

    private static int show(int num) {
        String s = num + "";
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        if (ss.startsWith("0")) {
            ss = ss.substring(1);
        }
        return Integer.parseInt(ss);
    }
}
