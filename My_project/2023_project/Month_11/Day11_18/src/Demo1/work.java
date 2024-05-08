package Demo1;

public class work {
    /**
     * 定义一个方法，参数是double m, int n
     * 将参数m保留n位小数
     */

    public static void main(String[] args) {
        System.out.println(function(123.4567, 5));
    }

    private static String function(double d, int num) {
        String str = d + "";
        int index = str.indexOf(".");
        String s1 = "";
        for (int i = 0; i <= index; i++) {
            s1 += str.charAt(i);
        }
        String s2 = "";
        for (int i = index + 1; i < str.length(); i++) {
            s2 += str.charAt(i);
        }
        if (s2.length() <= num) {
            int n = num - s2.length();
            for (int i = 0; i < n; i++) {
                str += "0";
            }
            return str;
        } else {
            for (int i = 0; i < s2.length() - num; i++) {
                s1 += s2.charAt(i);
            }
            return s1;
        }
    }
}
