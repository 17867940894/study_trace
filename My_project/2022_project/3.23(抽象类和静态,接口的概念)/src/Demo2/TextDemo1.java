package Demo2;

public class TextDemo1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.a = 456456;
        System.out.println(d.a);
        System.out.println(new Demo1().a);
        for (int i = 0; i < 3; i++) {
        Demo1.b();
        new Demo1().a();
        }
    }
}
