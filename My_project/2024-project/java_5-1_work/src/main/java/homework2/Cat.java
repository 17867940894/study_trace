package homework2;

public class Cat extends Animal{
    //2.2Cat类继承了 Animal 并实现方法 shout, 打印 “猫会喵喵叫”
    @Override
    void shout() {
        System.out.println("猫会喵喵叫");
    }
}
