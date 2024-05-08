package 多态.Demo2;

public class Test {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.i);
        f.a();
        f.b();
    }
}
