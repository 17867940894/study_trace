package Work;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private Integer age;
    private Double score;
    static List<Student> list = new ArrayList<>(){};

    @Override
    public String toString() {
        return "学生ID:   " + id + "  学生姓名:     " + name + "  学生年龄:   " + age + " 学生成绩:    " + score ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String id, String name, Integer age, Double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
