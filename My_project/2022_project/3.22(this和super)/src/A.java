public class A {
    public static void main(String[] args) {
        B b = new B();
    }
    public A() {
        System.out.println(1);
    }
    public A(int i ){
        System.out.println(2);
    }
}
class B extends A{
    public B() {
        this(3);
        System.out.println(3);
    }
    public B(int i ){
        System.out.println(4);
    }
}