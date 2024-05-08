package Work;

public class Mouse implements USB {

    public void cheat(){
        System.out.println("自动压枪");
    }

    @Override
    public void Connect() {
        System.out.println("鼠标连接");
    }

    @Override
    public void disconnect() {
        System.out.println("键盘连接断开");
    }
}
