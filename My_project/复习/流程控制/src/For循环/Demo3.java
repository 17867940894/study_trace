package For循环;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        int num = 0;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            num = Math.round(r.nextInt(100));
            System.out.println(num);
            if (num < 50 || num > 100) {
                --i;
            } else {
                System.out.println(num);
            }
        }
    }
}
