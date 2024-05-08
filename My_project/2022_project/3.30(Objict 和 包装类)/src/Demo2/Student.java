package Demo2;

public class Student {
    private Integer age;
    private Double score;
    private Character c;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", c=" + c +
                '}';
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

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    public Student() {
    }

    public Student(Integer age, Double score, Character c) {
        this.age = age;
        this.score = score;
        this.c = c;
    }
}
