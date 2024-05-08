package Work;

import java.util.Scanner;

//TODO 2.定义接口和它的两个实现
public class Text {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for (;;) {
            System.out.println("请选择连接的硬件: 1.麦克风 2.音响  其他键退出");
            String n = sc.next();
            Show(show(n));
        }
    }

    //TODO （1）定义方法，完成根据指定的整型参数返回指定的实现类对象
    public static USB show(String n){
        if (n.equals("1")){
            return new MIC();
        }
        if (n.equals("2")){
            return new Sound();
        }else {
            System.out.println("已退出");
            System.exit(0);
        }
            return null;
    }

    //TODO （2）定义方法，完成根据指定的实现类对象执行接口的共性方法和实现类的特有方法
    public static void Show(USB usb){
        usb.connect();
        if (usb instanceof MIC){
            MIC m = (MIC) usb;
            m.soundCard();
        }
        if (usb instanceof Sound){
            Sound s = (Sound) usb;
            s.stereoscopic();
        }
    }
}
