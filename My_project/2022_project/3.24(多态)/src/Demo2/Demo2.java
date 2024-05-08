package Demo2;

public class Demo2 {
    public static void main(String[] args) {
        a a = new b();
        System.out.println(a.a);
    }
}
abstract class a{
    int a = 0;
    public void show(){
        System.out.println("a类的普通show方法");
    }
}

class b extends a{

}