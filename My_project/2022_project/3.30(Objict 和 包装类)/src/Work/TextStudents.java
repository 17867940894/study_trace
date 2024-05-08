package Work;

import java.util.Arrays;

public class TextStudents {

    static Students[] students = new Students[1];

    public static void main(String[] args) {
        Students s1 = new Students("张三", 18);
        Students s2 = new Students("张四", 18);
        Students s3 = new Students("张四", 18);
        Students s4 = new Students("张五", 13);
        Students s5 = new Students("张六", 22);
        Students s6 = new Students("张四", 19);
        show(s1);
        show(s2);
        show(s3);
        show(s4);
        show(s5);
        show(s6);
        show2(students);
        new StudentsService().Start();
        show2(students);
    }

    public static void show2(Students[] students) {
        for (Students s : students)
            System.out.println(s);
        System.out.println();
    }

    public static void show(Students stu) {
        boolean b = true;
        for (Students s : students) {
            if (s == null) {
                students[students.length - 1] = stu;
                b = false;
                break;
            }
            if (!s.equals(stu)) {
                b = false;
            }
        }
        if (b) {
            students = Arrays.copyOf(students, students.length + 1);
            students[students.length - 1] = stu;
        }
    }
}

