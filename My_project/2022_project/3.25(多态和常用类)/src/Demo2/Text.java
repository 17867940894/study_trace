package Demo2;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18,66);
        Student s2 = new Student("王五",12,20);
        Student s3 = new Student("老六",58,90);
        Student s4 = new Student("李四",18,98);
        Student s5 = new Student("小七仔",58,50);
        Student[] students = {s1,s2,s3,s4,s5};
        Arrays.sort(students);
        show(students);
    }

    public static void show(Student[] student){
        for (Student s : student){
            System.out.println(s);
        }
    }
}
