package Demo1;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        String s = "adsdwugcaiucwa1658415wdasdbiwy";
        Map<String , Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) + "" , 0);
        }
        for (int i = 0; i < s.length(); i++) {
            String ss = s.charAt(i) + "";
            if (map.containsKey(ss))
                map.replace(ss, map.get(ss) + 1);
        }
        System.out.println(map);
    }
}
