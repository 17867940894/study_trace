package homework2;

public class Test {
    public static void main(String[] args) {
/*
2.4.在测试类中实例化对象 Animal cat = new Cat（）并调用 cat 的shout 方法
2.5.在测试类中实例化对象 Animal dog = new Dog（）并调用 dog 的shout 方法
 */
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
