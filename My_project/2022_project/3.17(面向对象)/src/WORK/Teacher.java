package WORK;

public class Teacher {
    public void inspect(Student student) {
        if (student.score < 60) {
            student.score = 60;
        }
    }
}
