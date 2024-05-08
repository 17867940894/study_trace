package Work;

import java.text.ParseException;

public class TextStudent {
    public static void main(String[] args) throws ParseException {
        Student s1 = new Student("张三", 2001, 07, 06);
        Student s2 = new Student("李四", 1989, 05, 28);
        Student s3 = new Student("王五", 1999, 07, 28);
        Student s4 = new Student("赵六", 1990, 02, 02);
        Student s5 = new Student("刘七", 2010, 06, 30);
        Student[] students = {s1, s2, s3, s4, s5};
        show(students);
        show2(students);
    }

    //TODO 将五个学生对象存储到数组中，输出最大的年龄差
    public static void show(Student[] student) {
        long min = student[0].getBirthday().getTime();
        long max = student[0].getBirthday().getTime();
        for (Student s : student) {
            max = Math.max(max, s.getBirthday().getTime());
            min = Math.min(min, s.getBirthday().getTime());
        }
        System.out.println("最大年龄差是: " + (max - min) + "毫秒");
    }

    //TODO 将五个学生对象存储到数组中，输出最大的年龄差y
    public static void show2(Student[] student) {
        long l = 0;
        for (Student s : student) {
            for (Student ss : student) {
                l = Math.max(l, Math.abs(ss.getBirthday().getTime() - s.getBirthday().getTime()));
            }
        }
        System.out.println("最大年龄差是: " + l + "毫秒");
    }
}
