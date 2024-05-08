package Work;

import java.util.Arrays;

//TODO 2.定义一个方法，参数是double a，int b将参数a保留b位小数。如果a的小数位本身就小于b，则不做操作
public class Demo2 {
    public static void main(String[] args) {
        double a = 10.123456789;
        System.out.println(show(a, 3));
    }

    private static double show(double a, int b) {
        String s = a + "";
        int num = s.indexOf(".");
        if (s.length() - num > b){
            String ss = "";
            for (int i = 0; i <= b + num; i++) {
                ss += s.charAt(i);
            }
            return Double.parseDouble(ss);
        }
        return Double.parseDouble(s);
    }
}
