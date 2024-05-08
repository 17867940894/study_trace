package Demo2;

import java.util.Random;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(101);
        System.out.println(n);
        while(true){
            System.out.println("请输入：");
            int m = sc.nextInt();
            if (m > n){
                System.out.println("大了");
            }else if(m < n){
                System.out.println("小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
