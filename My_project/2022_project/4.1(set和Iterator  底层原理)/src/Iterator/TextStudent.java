package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


//TODO 如果迭代同一个对象第二次的时候，注意迭代器的指针位置，不然会报NoSuchElementException
//TODO 方法一:重置迭代器  迭代器名字 = 被迭代对象.iterator();  例如  it = list.iterator();
//TODO 方法二:新建一个迭代器  Iterator<Student> iterator2 = list.iterator();
//TODO 每一个foreach底层都会创建一个新的迭代器





public class TextStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 18,90.0);
        Student s2 = new Student("张四", 18,80.5);
        Student s3 = new Student("张四", 18,80.5);
        Student s4 = new Student("张五", 13,77.0);
        Student s5 = new Student("张六", 22,59.5);
        Student s6 = new Student("张四", 19,null);
        list.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));
        foreach(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        iterator(list);
    }

    private static void iterator(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    private static void foreach(List<Student> list) {
        for (Student s : list)
            System.out.println(s);
    }
}
