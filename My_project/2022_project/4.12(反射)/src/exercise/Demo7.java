package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7 {
    //TODO 输出String集合中最长的字符串
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("", "156465416532489","45634153","5"));
        String max = list.get(0);
        for (String s : list) {
            max = max.length() > s.length()?max : s;
        }
        System.out.println(max);
    }
}
