package Teacher;

public class Teacher {
    private String id;
    private String name;
    private int age;
    private String sex;
    private Course[] courses;
    private double score;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Teacher() {
    }

    public Teacher(String id,String name, int age, String sex,  double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }
}
