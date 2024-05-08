package 接口.Demo2;

public class Dog {
    private int age;

    public void show(){
        System.out.println("汪汪汪");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(int age) {
        this.age = age;
    }
}
