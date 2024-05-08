package Work;

public class Hero {
    /**
     * 定义英雄类，定义它的3个属性和2个方法，在主函数中创建1个英雄类对象对这些属性进行赋值，再输出这些属性值
     */
    static String name = "";
    static int age = 0;
    static int height = 0;

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "王某";
        hero.age = 18;
        hero.height = 180;

        now(name, age, height);
        method(22);
    }

    private static void method(int i) {
        age = i;
        System.out.println("他的真实年龄是:" + age + "岁");
    }

    private static void now(String name, int age, int height) {
        System.out.println("身高" + height + "," + age + "岁的" + name + "正在Wc");
    }
}
