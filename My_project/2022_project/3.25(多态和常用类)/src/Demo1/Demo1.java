package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        a a = new a(){

            @Override
            void a() {
                System.out.println("a");
            }

            @Override
            void b() {
                System.out.println("b");
            }
        };
        a.a();
        a.b();
    }
}
abstract class a{
    abstract void a();
    abstract void b();
}
class b extends a{

    @Override
    void a() {

    }

    @Override
    void b() {

    }
}
class c extends a{

    @Override
    void a() {

    }

    @Override
    void b() {

    }
}