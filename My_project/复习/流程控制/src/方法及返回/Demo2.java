package 方法及返回;

/*
2.返回一个String数组中最长的字符串
 */
public class Demo2 {
    public static void main(String[] args) {
        String[] s = {"1212346", "", "641", "sadws", "sadwadwasascxa", "sa"};
        System.out.println(say(s));
    }

    public static String say(String[] s) {
        String ss = "";
        for (int j = 0; j < s.length - 1; j++) {
            ss = ss.length() >= s[j].length() ? ss : s[j];
        }
        return ss;
    }
}
