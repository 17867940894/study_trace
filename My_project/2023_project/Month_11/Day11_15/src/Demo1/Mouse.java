package Demo1;

public class Mouse extends Hardware implements Usb{

    public void peculiarMethod(){
        System.out.println("放光");
    }
    @Override
    public void connect() {
        System.out.println("鼠标已连接");
    }
}
