package dao;

public class Student {

    //测试类，以不同的权限修饰符修饰属性(file)
    public String name;
    private Integer age;
    protected Double score;
    Boolean sex;
    public static final Double PI = 3.1435926;

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Student(String name, Integer age, Double score, Boolean sex) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.sex = sex;
    }

    public Student() {
    }

    public void show(){
        System.out.println("show方法执行了");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", sex=" + sex +
                '}';
    }
}
