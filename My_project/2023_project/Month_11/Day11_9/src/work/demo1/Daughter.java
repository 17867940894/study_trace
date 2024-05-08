package work.demo1;

public class Daughter extends Fu{

    public Daughter() {
    }

    public Daughter(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void eat() {
        System.out.println("性别为" + sex + "年龄" + age + "岁" + "的" + name + "在饭桌吃饭");
    }
}
