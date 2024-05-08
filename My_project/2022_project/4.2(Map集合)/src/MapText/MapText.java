package MapText;

import java.util.Map;
import java.util.TreeMap;

public class MapText {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put(2,2);
        map.put(1,2);//TODO 将指定的值与此映射中的指定键关联（可选操作）。
        map.remove(1);//TODO 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
        map.remove(1,1);//TODO 返回此映射中以前关联该键的值，如果此映射不包含该键的映射关系，则返回 null。
        map.replace(2,3);//TODO 修改此映射关系关联该键的值
        map.replace(2,3,5);//TODO 修改此映射关系关联该键和值,如果此映射不包含该键值对，返回NULL
        map.get(2);//TODO 返回次映射关联该键的值
        map.getOrDefault(2,null);//TODO 如果k存在，则获取这个k所对应的v，如果k不存在，则返回defaultValuec
        map.containsKey(2);//TODO 如果此映射包含指定键的映射关系，则返回 true
        map.containsValue(2);//TODO 如果此映射包含指定值的映射关系，则返回 true
        map.clear();//TODO 从此映射中移除所有映射关系（可选操作）。
        map.isEmpty();//TODO 如果此映射未包含键-值映射关系，则返回 true
        map.size();//TODO 返回此映射中的键-值映射关系数。
    }
}