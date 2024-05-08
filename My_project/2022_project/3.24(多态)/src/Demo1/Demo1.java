package Demo1;

public class Demo1 {
    public static void main(String[] args) {

    }
}

interface A{
   void a();//TODO 如果A的实现类继承了另一个类，另一个类中有A类的同名方法，那么那个类不需要重写A类的同名方法

}

interface B{
    void b();
}

interface C extends A,B{
    void c();
}

class D{
    public void a(){

    }
}

class E extends D implements C,A,B{

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

}