package Demo3;

public class Key extends Computer implements USB{

    @Override
    public void Connect() {
        System.out.println("键盘连接");
    }

    @Override
    public void disconnect() {
        System.out.println("键盘连接断开");
    }
}
