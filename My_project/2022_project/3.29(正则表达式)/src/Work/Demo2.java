package Work;

import java.util.Arrays;

//TODO 2.将一个字符串中的每一个字符存储到char数组中
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(show("123456789abcdefg")));;
    }

    private static char[] show(String s) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }
}
