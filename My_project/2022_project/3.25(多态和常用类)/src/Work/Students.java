package Work;

import java.util.Comparator;

public class Students /*implements *//*Comparable<Students>*//* Comparator<Students>*/ {
    private String name;
    private int age;
    private double score;

    @Override
    public String toString() {
        return "Students{" +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Students() {
    }

    public Students(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /*@Override TODO 重写Comparator 接口方法
    public int compare(Students s1, Students s2) {
        return s1.score == s2.score?s2.age - s1.age:(int) (s1.score*100 - s2.score*100);//TODO 成绩升序排列，如果成绩相同，则按年龄降序排列
    }*/

    /*@Override TODO 重写Comparable 接口方法
    public int compareTo(Students s) {
        return s.score == this.score?this.age - s.age:(int)(s.score*100 - this.score*100);//TODO 成绩降序排列，如果成绩相同，则按年龄升序排列
    }*/
}
