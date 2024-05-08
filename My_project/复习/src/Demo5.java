public class Demo5 {
    /*
    5. 最长回文子串给你一个字符串 s，找到 s 中最长的回文子串。
     */
    public static void main(String[] args) {
        String s = "dsadssaaaaaaaaaanindaaa";
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                String s1 = s.substring(j, j + i + 1);
                if (huiwen(s1)) {
                    if (s1.length() > 2) {
                        ss = ss.length() > s1.length() ? ss : s1;
                    }
                }
            }
        }
        System.out.println("最长回文子串是" + ss);
    }

    public static boolean huiwen(String s) {
        for (int j = 0; j < s.length() / 2; j++) {
            if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
}


