package 循环结构;

/*
找出字符串中大写字母，小写字母，数字的个数
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "121asd5a8s;,阿萨【ldaSDDsCSssxswa";
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ++c;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ++b;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ++a;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
