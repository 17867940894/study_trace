package Work;
//定义两个类，子类和父类，父类属性私有化，思考如何在创建子类对象时，对这些共性的私有化属性赋值
public class A extends B{
    String id;
    public A(String name, int age, double score , String id) {
        super(name, age, score);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public A() {
        super();
    }
}
class B{
    private String name;
    private int age;
    private double score;



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

    public B() {
    }

    public B(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}