package 多态.Demo2;

public class Zi extends Fu{
    int i = 0;
    int j = 1;

    @Override
    public void a() {
        System.out.println("子类的a方法");
    }

    public void b(){
        System.out.println("子类的b方法");
    }
}
