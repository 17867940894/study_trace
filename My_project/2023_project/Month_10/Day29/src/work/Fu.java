package work;

public class Fu {
    String name;
    int age;
    double height;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Fu() {
    }

    public Fu(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
