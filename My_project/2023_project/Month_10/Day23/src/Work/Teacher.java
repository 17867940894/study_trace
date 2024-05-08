package Work;

import java.util.Arrays;

/**
 * 定义一个类，完成其属性的增删改查
 */
public class Teacher {
    int id;
    String name;
    int age;
    String[] course = new String[0];

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course=" + Arrays.toString(course) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String[] course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
