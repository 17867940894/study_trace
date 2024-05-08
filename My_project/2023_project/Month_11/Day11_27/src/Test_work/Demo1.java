package Test_work;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    /**
     * 使用集合完成
     * 1.将一个学生对象存储到学生集合中，如果该学生对象的所有属性和集合中已存在的某个学生对象的所有属性全部相同，则不存储
     * 2.删除学生集合中指定姓名的学生对象
     */
    public static void main(String[] args) {
        Student s1 = new Student("张三3" , 60);
        Student s2 = new Student("李四4" , 90);
        Student s3 = new Student("王五5" , 60);
        Student s4 = new Student("李四4" , 90);
        Student s5 = new Student("张三丰" , 10);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        isRepeat(students);
        show(students);
        delete(students , "张三3");
        System.out.println("---------------------");
        show(students);
    }

    private static void delete(ArrayList<Student> students, String s) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getName() == s)
                iterator.remove();
        }
    }

    private static void isRepeat(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).equals(students.get(j)))
                    students.remove(j);
            }
        }
    }

    private static void show(ArrayList<Student> students) {
        for(Student s : students){
            System.out.println(s);
        }
    }

}

class Student{
    private String name;
    private Integer score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if(student.name == this.name && student.score == this.score)
            return true;
        return false;
    }
}
