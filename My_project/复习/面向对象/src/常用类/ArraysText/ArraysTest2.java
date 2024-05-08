package 常用类.ArraysText;

import java.util.Arrays;

public class ArraysTest2 {
    //TODO 对象属性的排序
    public static void main(String[] args) {
        Students s1 = new Students("张三",18,90);
        Students s2 = new Students("李四",38,60);
        Students s3 = new Students("王五",48,80);
        Students s4 = new Students("赵六",28,100);
        Students s5 = new Students("赵六",28,90);
        Students[] s = {s1,s2,s3,s4,s5};
        Arrays.sort(s);//TODO 类型转换异常
        show(s);
    }

    public static void show(Students[] s){
        for(Students stu : s){
            System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getScore());
        }
    }
}

class Students implements Comparable<Students>{
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

    @Override
    public int compareTo(Students students) {
        if (this.age == students.age) {
            return (int)(this.score*10 - students.score*10);
        }
        return students.age - this.age;
    }
}