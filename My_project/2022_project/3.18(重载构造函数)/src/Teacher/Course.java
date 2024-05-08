package Teacher;

public class Course {
    private String courseName;
    private int time;
    private int point;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Course() {
    }

    public Course(String courseName, int time, int point) {
        this.courseName = courseName;
        this.time = time;
        this.point = point;
    }
}
