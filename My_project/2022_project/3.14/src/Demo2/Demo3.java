package Demo2;

import java.util.Random;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt('z'+1)+ ' ';
            if (((num >= '0' && num <= '9') || (num >= 'a' && num <= 'z') || (num >= 'A' && num <= 'Z'))) {
                System.out.print((char) num + " ");
            }else{
                i--;
            }
        }
    }
}
