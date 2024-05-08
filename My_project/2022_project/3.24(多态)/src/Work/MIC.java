package Work;

public class MIC implements USB{
    //声卡
    public void soundCard(){
        System.out.println("您的声卡已打开");
    }

    @Override
    public void connect() {
        System.out.println("麦克风已连接");
    }
}
