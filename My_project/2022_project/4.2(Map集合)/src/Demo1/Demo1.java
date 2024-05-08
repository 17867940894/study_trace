package Demo1;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(1,"赵六");//TODO 如果键重复了   新值会覆盖旧值 原来的键值对就没有了
        System.out.println(map.getOrDefault(3,"6"));
    }
}
