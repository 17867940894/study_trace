package Demo3;

public class Computer {
    public void Start(){
        System.out.println("电脑开机");
    }

    public void Eed(){
        System.out.println("电脑关机");
    }

    public static void Connect(USB usb){
        usb.Connect();
    }

    public static void DisConnect(USB usb){
        usb.disconnect();
    }
}
