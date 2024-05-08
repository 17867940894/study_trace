package date;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("张三" , new Date(System.currentTimeMillis() - 1000L * 3600 * 24 * 365 * 10));
        Student student2 = new Student("李四" , new Date(System.currentTimeMillis() - 1000L * 3600 * 24 * 365 * 12));
        Student student3 = new Student("王五" , new Date(System.currentTimeMillis() - 1000L * 3600 * 24 * 365 * 20));
        Student student4 = new Student("赵六" , new Date(System.currentTimeMillis() - 1000L * 3600 * 24 * 365 * 18));
        Student[] students = {student1,student2,student3,student4};
        for(Student s : students){
            System.out.println(s.toString());
        }
        System.out.println("--------------------------------------------");
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
