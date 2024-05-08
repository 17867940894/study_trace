package Month4.day08.java;

public class Demo1 {
    public static void main(String[] args) {
        /*Integer a = 1 , b = 2;
        A.function(a,b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);*/
        A a = new A();
        a.a = 10;
        a.show(a);
        System.out.println(a);
        System.out.println(a.a);
    }
}

class A{
    int a;
    public static void function(Integer a , Integer b){
        a = 10;
        b = 20;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();
    }

    public void show(A a) {
        System.out.println(a);
        a = null;
        System.out.println(a);
    }
}