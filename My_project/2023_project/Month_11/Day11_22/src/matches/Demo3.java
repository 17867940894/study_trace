package matches;

public class Demo3 {
    public static void main(String[] args) {
        final String s = "SSSsss1daaaasss3sd16wadwadSIUAHDIidjoaisdDWIOQD4656D416WA4Dx90";
        function1(s);
        function2(s);
    }

    private static void function2(String s) {
        s = "你你你你也也也也也喜喜欢欢欢欢欢学习习习吗";
        System.out.println(s.replaceAll("(.)\\1+" , "$1"));
    }

    //将字符串重复的多个字符化为一个
    private static void function1(String s1) {
        String s2 = "";
        for (;s1.length() != 0;) {
            s2 += s1.charAt(0) + "";
            s1 = s1.replaceAll( s1.charAt(0) + "" , "");
        }
        System.out.println(s2);
    }
}
