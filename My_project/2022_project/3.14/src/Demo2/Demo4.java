package Demo2;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String s = "";
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt('z' + 1) + ' ';
            if (!((num >= '0' && num <= '9') || (num >= 'a' && num <= 'z') || (num >= 'A' && num <= 'Z'))) {
                i--;
            } else {
                s += (char) num;
            }
        }
        System.out.println(s);
        System.out.println("请输入:");
        String ss = sc.nextLine();
        if (s.equals(ss)) {
            System.out.println("验证码正确");
        } else {
            System.out.println("验证码错误");
        }
    }
}
