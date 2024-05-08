package work;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student("张三3" , 18);
        Student student2 = new Student("李四" , 12);
        Student student3 = new Student("王五" , 13);
        Student student4 = new Student("赵六" , 18);
        Student student5 = new Student("张76" , 20);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        showAge(arrayList);
        showName(arrayList);

    }

    private static void showName(ArrayList<Student> arrayList) {
        for (Student student: arrayList) {
            if (student.getName().startsWith("张") && student.getName().length() == 3)
                System.out.println(student.getName());
        }
    }

    private static void showAge(ArrayList<Student> arrayList) {
        int sum = 0;
        for (Student student: arrayList) {
            sum += student.getAge();
            System.out.println(student);
        }
        System.out.println("年龄总和：" + sum);
    }

}
class Student{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
