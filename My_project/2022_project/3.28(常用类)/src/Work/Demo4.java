package Work;
//TODO 4.判断手机号是否是标准的，1开头 11位的 纯数字
public class Demo4 {
    public static void main(String[] args) {
        System.out.println(show("17867940804"));
    }

    private static String show(String s) {
        if (s.length() != 11)
            return "格式错误";
        if (!s.startsWith("1"))
            return "格式错误";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0')
                return "格式错误";
        }
        return "格式正确";
    }
}
