package MapText;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Foreach {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"1");
        map.put(3,"1");
        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }
}
