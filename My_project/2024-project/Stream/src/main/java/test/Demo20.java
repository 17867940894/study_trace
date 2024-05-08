package test;

import dao.Student;

import java.util.Arrays;
import java.util.List;

public class Demo20 {


        public static void main(String[] args) {
            Student student1 = new Student("周明",75);
            Student student2 = new Student("赵凯",83);
            Student student3 = new Student("李强",97);
            Student student4 = new Student("孙国",62);

            List<Student> students = Arrays.asList(student1,student2,student3,student4);

            students.sort(Student::compareStudentByName);
            students.forEach(student -> System.out.println(student.getName()));
        }

}

