package WORK;

//4.定义英雄类，定义它的3个属性和2个方法，在主函数中创建1个英雄类对象对这些属性进行赋值，再输出这些属性值
public class Demo4 {
    static int age;
    static String name;
    static String color;


    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        demo4.name = "张三";
        demo4.color = "黄颜色";
        demo4.age = 40;
        a(18);
        demo4.WC();
        demo4.Work();

    }

    public void WC() {
        System.out.println(age + "岁" + color + "的" + name + "在上厕所!");
    }

    public void Work() {
        System.out.println(name + "有工作");
    }

    public static void a(int i){
        age = i;
    }
}
