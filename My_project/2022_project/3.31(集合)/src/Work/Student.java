package Work;

import java.util.Objects;

public class Student {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;
        Student student = (Student) o;
        if (this.name != student.name)
            return true;
        if (this.age != student.age)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

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
