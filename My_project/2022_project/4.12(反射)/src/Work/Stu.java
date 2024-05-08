package Work;

public class Stu {
    private String name;
    private Integer age;

    public Stu() {
    }

    public Stu(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void learn(String subject){
        System.out.println(name + "在学习" + subject);
    }
}
