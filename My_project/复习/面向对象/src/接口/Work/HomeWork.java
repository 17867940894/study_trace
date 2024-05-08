package 接口.Work;

public class HomeWork {
    public static void main(String[] args) {
        Computer c = new Computer();
        Mouse m = new Mouse("罗技",300,12000);
        Key k = new Key("双飞燕",200,114);
        c.open();
        c.connect(m);
        c.connect(k);
    }
}
