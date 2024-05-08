package Sort;

public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private Double score;

    @Override
    public String toString() {
        return "Student{" +
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

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age == o.age? (int) (this.score - o.score) :o.age  - this.age;//TODO 年龄降序,如果年龄相同，成绩升序
        return this.age == o.age?this.name.compareTo(o.name) :o.age  - this.age;//TODO 年龄降序,如果年龄相同，按名字排序
    }
}
