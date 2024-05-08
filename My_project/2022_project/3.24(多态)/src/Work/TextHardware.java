package Work;

import java.util.Scanner;
//TODO 1.定义抽象类和它的两个子类
public class TextHardware {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for (;;) {
            System.out.println("请选择需要的商品: 1.鼠标  2.键盘  其他键退出");
            String n = sc.next();
            show(Show(n));
        }
    }

    //TODO （1）定义方法，完成根据指定的整型参数返回指定的子类对象
    public static Hardware Show(String n){
            if (n.equals("1")) {
                System.out.println("请输入定制鼠标的名字:");
                String name = sc.next();
                System.out.println("请输入定制鼠标的价格:");
                int money = sc.nextInt();
                return new Mouse(name,money);
            } else if (n.equals("2")) {
                System.out.println("请输入定制键盘的名字:");
                String name = sc.next();
                System.out.println("请输入定制鼠标的价格:");
                int money = sc.nextInt();
                return new Key(name,money);
            } else {
                System.out.println("已退出");
                System.exit(0);
            }
            return null;
        }

    //TODO （2）定义方法，完成根据指定的子类对象执行父类的共性方法和子类的特有方法
    public static Hardware show(Hardware hardware){
        if (hardware instanceof Mouse){
            Mouse mouse = (Mouse) hardware;
            mouse.cheat();
        }
        if (hardware instanceof Key){
            Key key = (Key)hardware;
            key.shine();
        }
        hardware.briefIntroduction(hardware);
        return hardware;
    }
}
