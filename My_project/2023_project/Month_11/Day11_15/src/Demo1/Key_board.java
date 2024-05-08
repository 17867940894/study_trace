package Demo1;

public class Key_board extends Hardware implements Usb{
    public void peculiarMethod(){
        System.out.println("声音很好听");
    }
    @Override
    public void connect() {
        System.out.println("键盘已连接");
    }
}
