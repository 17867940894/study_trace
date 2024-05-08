package exercise;

import java.util.*;

public class Demo3 {
    //TODO 将一个List集合转换成数组
    public static void main(String[] args) {
        List list = new ArrayList();
        list.addAll(Arrays.asList("1","1","2"));
        String[] s = {};
        s = (String[]) list.toArray(s);
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
