package Demo1;

//小学生类
public class Pupil<Students> extends Student{
    String school;

    public Pupil(String school) {
        this.school = school;
    }

    public Pupil(String name, int age, int score, String school) {
        super(name, age, score);
        this.school = school;
    }

    public <T> void show(T t){

    }
}
