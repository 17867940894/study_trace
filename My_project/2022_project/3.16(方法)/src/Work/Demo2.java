package Work;

//2.返回一个字符串和另一个字符串的长度差
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(show("1255555", "4567"));
    }

    private static int show(String s, String s1) {
        return s.length() > s1.length() ? s.length() - s1.length() : s1.length() - s.length();
    }
}
