package Demo3;

public class Gunner {
    public void updateScore(Student student){
        if (!student.name.startsWith("张")){
            if (student.score < 60)
                student.score = 60;
        }
    }
}
