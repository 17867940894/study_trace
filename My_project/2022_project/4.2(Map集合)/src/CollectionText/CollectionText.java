package CollectionText;

import java.util.ArrayList;
import java.util.Arrays;
//TODO Collection接口的常用方法
public class CollectionText {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        list.add("A");//TODO 确保此 collection 包含指定的元素（可选操作）。
        list.addAll(Arrays.asList("1","2","3)"));//TODO 将指定 collection 中的所有元素都添加到此 collection 中（可选操作）。
        list.remove("A");//TODO 从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。 可以是对象，也可以是下标
        list.contains("1");//TODO 如果此 collection 包含指定的元素，则返回 true。
        list.size();////TODO 返回集合的容量
        list.isEmpty();//TODO 判断集合是否为空
        list.clear();//TODO 移除集合中所有的元素
        list.removeAll(list1);//TODO 移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。
        list.containsAll(list1);//TODO 如果此 collection 包含指定 collection 中的所有元素，则返回 true。
    }
}
