package 多态2.Demo1;

public class Test {
    public static void main(String[] args) {
        Object o = f();
    }

    public static Object f() {
        //return new A();
        return new D();
    }
}

class A {

}

class B extends A {

}

interface C {

}

class D implements C{

}
