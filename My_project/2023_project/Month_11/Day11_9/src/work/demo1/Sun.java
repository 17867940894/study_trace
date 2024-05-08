package work.demo1;

public class Sun extends Fu{
    public Sun() {
    }

    public Sun(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void eat() {
        System.out.println("性别为" + sex + "年龄" + age + "岁" + "的" + name + "在地上吃饭");
    }
}
