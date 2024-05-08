package Work;

public class Key implements USB {

    public void shine(){
        System.out.println("发光");
    }

    @Override
    public void Connect() {
        System.out.println("键盘连接");
    }

    @Override
    public void disconnect() {
        System.out.println("键盘连接断开");
    }
}
