package Demo3;

public class TextDemo2 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        new Thread(demo2).start();
        new Thread(demo2).start();
        new Thread(demo2).start();
    }
}
