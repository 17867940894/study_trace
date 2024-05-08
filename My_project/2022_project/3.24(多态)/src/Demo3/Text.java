package Demo3;

import java.util.Scanner;

public class Text {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("您需要定制的是: 1.鼠标 2.键盘");
            int a = sc.nextInt();
            new Text().show(a);
        }
    }

    public void show(int a){
        if (a == 1){
            System.out.println("请输入定制鼠标的名字:");
            String mouse = sc.next();
            System.out.println("请输入定制鼠标的价格:");
            int money = sc.nextInt();
            System.out.println("请输入定制鼠标的DPI:");
            int dpi = sc.nextInt();
            HardwareFactory.show(new Mouse(mouse,money,dpi));
        }if (a == 2){
            System.out.println("请输入定制键盘的名字:");
            String name = sc.next();
            System.out.println("请输入定制鼠标的价格:");
            int money = sc.nextInt();
            HardwareFactory.show(new Key(name,money));
        }else if (a == 0){
            System.out.println("已退出");
            System.exit(0);
        }
    }
}
