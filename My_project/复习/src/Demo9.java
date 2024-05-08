public class Demo9 {
    /*
    9. 回文数给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     */
    public static void main(String[] args) {
        System.out.println(show(234565432));
    }

    private static boolean show(int i) {
        String s = i + "";
        for (int j = 0; j < s.length() / 2; j++) {
            if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
                return false;
            }
        }
        return true;
    }
}
