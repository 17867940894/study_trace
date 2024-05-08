package 接口.Demo1;

public class Mouse implements USB {

    public void dadada(){
        System.out.println("自动压枪");
    }

    @Override
    public void connect() {
        System.out.println("鼠标连接");
    }

    @Override
    public void disconnect() {
        System.out.println("鼠标连接断开");
    }
}
