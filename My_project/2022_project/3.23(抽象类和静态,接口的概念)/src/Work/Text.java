package Work;
/*
1.自定义两个类和它们的父类，在父类中定义抽象方法，
创建子类对象，
（1）使用重载构造函数对属性赋值，并查看属性值
（2）使用set方法对属性赋值，并查看属性值
 */
public class Text {
    public static void main(String[] args) {
        Zi z1 = new Zi("麦克",18,"强壮");
        z1.show();
        z1.hobby();
        Zi_2 z2 = new Zi_2();
        z2.setName("杰克");
        z2.setAge(20);
        z2.setVoice("超级大");
        z2.show();
        z2.hobby();
    }
}
