package work.Demo1;

public class Fu {
    String name;
    int age;

    @Override
    public String toString() {
        return "Fu{" +
                "name='" + name + '\'' +
                ", age=" + age +
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

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
