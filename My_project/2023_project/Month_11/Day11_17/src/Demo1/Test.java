package Demo1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18, 100);
        Student student2 = new Student("王五", 28, 90);
        Student student3 = new Student("李四", 18, 12);
        Student student4 = new Student("赵六", 18, 50);
        Student student5 = new Student("张刚", 18, 90);
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student s : students) {
            System.out.println(s.toString());
        }
        Arrays.sort(students);
        System.out.println("-------------------------------");
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
