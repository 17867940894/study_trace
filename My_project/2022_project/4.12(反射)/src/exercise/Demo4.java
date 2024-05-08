package exercise;

import java.util.Map;
import java.util.TreeMap;

public class Demo4 {
    //todo 使用entrySet和keySet遍历Map集合
    public static void main(String[] args) {
        Map<Integer,Integer> map = new TreeMap<>();
        map.put(0,7);
        map.put(5,5);
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + "\t" + m.getValue());
        }
        System.out.println("华丽的分割线");
        for (Integer integer : map.keySet()) {
            System.out.println( integer + "\t" + map.get(integer));
        }
    }
}
