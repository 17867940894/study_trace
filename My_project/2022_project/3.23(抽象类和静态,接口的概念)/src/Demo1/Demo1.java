package Demo1;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("匿名随机数Double:\t" + new A() {
            @Override
            public double a() {
                return new Random().nextInt(20);
            }
        }.a());
    }
}

abstract class A {
    public abstract double a();
}
