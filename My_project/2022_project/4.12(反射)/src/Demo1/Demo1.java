package Demo1;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Students s1 = new Students("zs",18);
        Class c1 = s1.getClass();
        Class c2 = Class.forName("Demo1.Students");
        Class c3 = Students.class;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c3 == c1);
    }
}

class Students{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Students{" +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Students() {
    }

    public Students(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}