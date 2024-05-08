package Demo1;

import java.util.ArrayList;
import java.util.List;

public class TextStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("张三",18,80.5));
        list.add(new Student("李四",16,50.5));
        list.add(new Student("王五",15,60.5));
        list.add(new Student("赵六",18,86.5));
        list.add(new Student("刘七",18,70.5));
        show(list);
    }

    private static void show(List<Student> list) {
        for (Student s : list)
            System.out.println(s);
    }


}
