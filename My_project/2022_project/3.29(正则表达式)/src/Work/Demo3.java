package Work;

import java.util.Arrays;

//TODO 3.统计一个字符串中，每一个字符出现的个数
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("123asddsa4566578wdawdcwwsg326".length());
        show("123asddsa4566578wdawdcwwsg326");
    }

    private static void show(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            int conte = 0;//TODO 记录每一个字符出现的次数
            for (int j = i + 1; j <= ch.length; j++) {
                conte++;
                if (j == ch.length){
                    System.out.println(ch[i] + "   出现的次数是:     " + conte);
                    return;
                }
                if (ch[i] != ch[j]) {
                    System.out.println(ch[i] + "   出现的次数是:     " + conte);
                    i = j - 1;
                    break;
                }
            }
        }
    }
}
