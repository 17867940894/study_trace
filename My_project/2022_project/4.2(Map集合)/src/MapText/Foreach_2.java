package MapText;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Foreach_2 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,20);
        map.put(2,30);
        map.put(3,50);
        map.put(4,40);
        System.out.println(show(map));
    }

    private static Map.Entry<Integer, Integer> show(Map<Integer, Integer> map) {
        int age = 0;
        for (Integer value : map.values()) {
            age = Math.max(age,value);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue() == age)
                return integerIntegerEntry;
        }
        return null;
    }
}
