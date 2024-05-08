package Demo2;

public class Demo1 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(A.i);
    }
}
interface A{
    int i = 0;
}
class B implements A{

}