package Work;
/*
2.设计程序：
定义Usb接口，定义它的实现类鼠标和键盘类，重写接口中的连接功能。定义电脑类，在电脑类中定义连接Usb设备的功能。
运行程序输出显示：
电脑打开
鼠标连接
键盘连接
 */
public class TextComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.Start();
        Computer.Connect(new Key());
        new Key().shine();
        Computer.Connect(new Mouse());
        new Mouse().cheat();
        Computer.DisConnect(new Key());
        Computer.DisConnect(new Mouse());
        computer.End();
    }
}
