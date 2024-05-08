package Work;

public interface USB {
    void Connect();//连接
    void disconnect();//断开
    default void show(int i){
        System.out.println(666);
    }
}
