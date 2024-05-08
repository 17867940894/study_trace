package TestInstanceof;

import java.util.Random;

//instanceof使用细节
public class TestInstanceof {
    public static void main(String[] args) {
        Random r = new Random();
        //System.out.println(r instanceof Scanner);如果对象与指定类型不相同并且没有继承关系，则编译失败
        //System.out.println(r instanceof Random);在没有多态的情况下，判断对象是否属于创建时指定的类型，是没有意义的，因为结果永远为true
        Fu f = new Zi();
        /*
        System.out.println(f instanceof Nv);如果判断一个子类对象是否属于它的父类，也是没意义的，因为结果永远为true
        System.out.println(f instanceof Zi);
        1. 只有在多态的情况下，判断引用变量是否是多态时父类的子类时才有意义
        `instanceof`使用的总结：在多态下，判断引用变量是否是多态时父类的子类
        */

    }
}
class Fu{

}
class Zi extends Fu{

}
class Nv extends Fu{

}