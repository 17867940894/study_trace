package 接口.Demo2;

//牧羊犬
public class Huntaway extends Dog implements Detection {
    void huntaway() {
        System.out.println("牧羊");
    }

    @Override
    public void find() {
        System.out.println("搜寻");
    }

    @Override
    public void grasp() {
        System.out.println("抓人");
    }
}
