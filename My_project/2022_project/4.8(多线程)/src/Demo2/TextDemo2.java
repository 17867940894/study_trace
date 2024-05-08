package Demo2;

public class TextDemo2 {
    public static void main(String[] args) {
        new Thread(new Demo1()){}.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main~~~~~"  + i);
        }
    }
}
