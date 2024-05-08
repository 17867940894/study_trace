package work.demo1;

public abstract class Fu {

    int age;
    String name;
    String sex;

    @Override
    public String toString() {
        return "Fu{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Fu() {
    }

    public Fu(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public abstract void eat();

}
