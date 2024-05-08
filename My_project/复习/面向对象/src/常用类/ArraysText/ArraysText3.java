package 常用类.ArraysText;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysText3 {
    //TODO 对象属性的排序
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, 90);
        Student s2 = new Student("李四", 38, 60);
        Student s3 = new Student("王五", 48, 80);
        Student s4 = new Student("赵六", 28, 100);
        Student s5 = new Student("赵六", 28, 90);
        Student[] s = {s1, s2, s3, s4, s5};
        /*Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                    return s2.getAge() == s1.getAge() ? (int) (s1.getScore() * 10 - s2.getScore() * 10) : s2.getAge() - s1.getAge();
                    //TODO 年龄降序 如果年龄相同，成绩升序
            }
        });*/
        Arrays.sort(s,new Student());
        show(s);
    }

    public static void show(Student[] s) {
        for (Student stu : s) {
            System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getScore());
        }
    }

}

class Student implements Comparator<Student> {
    private String name;
    private int age;
    private double score;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s2.age == s1.age ? (int) (s1.score * 10 - s2.score * 10) : s2.age - s1.age;//TODO 年龄降序 如果年龄相同，成绩升序
    }
}