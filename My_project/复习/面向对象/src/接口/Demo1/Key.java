package 接口.Demo1;

public class Key implements USB{

    public  void Looking(){
        System.out.println("透视");
    }

    @Override
    public void connect() {
        System.out.println("键盘连接");
    }

    @Override
    public void disconnect() {
        System.out.println("键盘连接断开");
    }
}
