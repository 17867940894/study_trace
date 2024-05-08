package Demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("1:鼠标 2.键盘 其他任意键退出");
            estimate(show(sc.next()));
        }
    }

    //判断返回接口数据类型 从而调用子类的特有方法
    private static void estimate(Usb usb) {
        usb.connect();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.peculiarMethod();
        }
        if (usb instanceof Key_board){
            Key_board key_board = (Key_board) usb;
            key_board.peculiarMethod();
        }
    }

    //返回需要的对象
    private static Usb show(String next) {
        if (next.equals("1"))
            return new Mouse();
        if (next.equals("2"))
            return new Key_board();
        else{
            System.out.println("程序已结束");
            System.exit(0);
        }
        return null;

    }
}
