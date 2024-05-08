package Demo5;

public class Teacher {
    String name;
    int age;
    double score;
    Course[] courses;

    public Teacher() {
    }

    public Teacher(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void show(){
        System.out.print("姓名:" + name);
        System.out.print("\t\t年龄:" + age);
        System.out.println("\t工资:" + score);
    }
}
