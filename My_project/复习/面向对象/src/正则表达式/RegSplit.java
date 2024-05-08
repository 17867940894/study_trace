package 正则表达式;

import java.util.Arrays;

public class RegSplit {
    public static void main(String[] args) {
        a("10.11.123.89");
        b("10-----1-1-123-89");
    }

    //TODO 获取IP地址中的每一段
    public static void b(String s) {
        System.out.println(Arrays.toString(s.split("[-]+")));
    }

    //TODO 获取IP地址中的每一段
    public static void a(String s) {
        System.out.println(Arrays.toString(s.split("[.]")));
    }


}
