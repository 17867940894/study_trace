package Month4.day16.java;

import Month4.day16.java.bean.Student;

public class Demo1 {
    public static void main(String[] args) {
        /*Student student1 = new Student(10,"zs",20);
        System.out.println(student1);
        */
        Student s1 = new Student();
        Student s2 = new Student();
        new Thread(s1).start();
        new Thread(s2).start();

    }
}
