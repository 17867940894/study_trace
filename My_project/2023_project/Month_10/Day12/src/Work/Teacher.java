package Work;

public class Teacher {
    public void method(Student student){
        if (student.score < 60){
            student.score = 60;
        }
    }
}
