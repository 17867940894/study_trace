package Work;
//音响
public class Sound implements USB{
    //立体感
    public void stereoscopic(){
        System.out.println("3D环绕音效已开启");
    }

    @Override
    public void connect() {
        System.out.println("音响已连接");
    }
}
