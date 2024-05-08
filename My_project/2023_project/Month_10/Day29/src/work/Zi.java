package work;

public class Zi extends Fu{
    String school;

    public void show(){
        System.out.println("学校:" + this.school);
        System.out.println("姓名:" + this.name);
        System.out.println("年龄:" + this.age);
        System.out.println("身高:" + this.height);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Zi(){

    }

    public Zi(String school) {
        this.school = school;
    }

    public Zi(String name, int age, double height, String school) {
        super(name, age, height);
        this.school = school;
    }
}
