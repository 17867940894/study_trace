package homework2;

public class Dog extends Animal{
    //2.3.Dog 类继承了Animal 并实现方法 shout，打印 “狗会汪汪叫”
    @Override
    void shout() {
        System.out.println("狗会汪汪叫");
    }
}
