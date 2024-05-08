package Demo2;

public class Teacher {
    String name;
    int age;
    String sex;
    double score;
    String natiom;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "姓名'" + name + "\t" +
                "年龄" + age +
                "性别'" + sex + "\t" +
                "工资" + score +
                "国籍" + natiom + "\t" +
                '}';
    }

    public Teacher(String name, int age, String sex, double score, String natiom) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.natiom = natiom;
    }
}
