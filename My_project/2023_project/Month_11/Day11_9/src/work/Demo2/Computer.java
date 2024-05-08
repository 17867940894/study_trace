package work.Demo2;

public class Computer {

    public void start(){
        System.out.println("开机");
    }

    public void close(){
        System.out.println("关机");
    }


    public void boot(Usb usb){
        usb.connect();
    }

    public void shutdown(Usb usb){
        usb.disConnect();
    }
}
