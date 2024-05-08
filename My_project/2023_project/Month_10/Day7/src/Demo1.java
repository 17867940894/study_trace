import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    /*
        四位数验证码
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            switch (r.nextInt(3)) {
                case 0:
                    st += (char) ('0' + r.nextInt('9' - '0'));
                    break;
                case 1:
                    st += (char) ('A' + r.nextInt('Z' - 'A'));
                    break;
                case 2:
                    st += (char) ('a' + r.nextInt('z' - 'a'));
                    break;
            }
        }
        System.out.println(st);
        System.out.println("请输入验证码");
        String st2 = sc.next();
        if (st2.equals(st))
            System.out.println("输入正确");
        else
            System.out.println("输入错误");
    }
}
