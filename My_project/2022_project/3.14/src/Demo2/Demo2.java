package Demo2;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }
    }
}
