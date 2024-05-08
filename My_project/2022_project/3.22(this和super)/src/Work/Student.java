package Work;

public class Student extends Students{
    private String home;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Student() {
    }

    public Student(String home) {
        this.home = home;
    }

    public Student(String name, int age, int score, String home) {
        super(name, age, score);
        this.home = home;
    }
}
