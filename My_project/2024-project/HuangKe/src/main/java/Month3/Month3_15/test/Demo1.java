package Month3.Month3_15.test;

import util.GetScanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("张三还钱吗？ 1:还钱 2:不还钱");
        Scanner scanner = GetScanner.getScanner();
        int next = scanner.nextInt();
        if (next == 2)
            System.out.println("闪电五连鞭");
        else
            System.out.println("what can i say");
    }
}
